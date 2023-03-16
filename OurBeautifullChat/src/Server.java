import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    private ServerSocket serverSocket;
    private ExecutorService executorService;
private LinkedList<ClientHandler> linkedList;
private Nomes[] nomes;



    public Server(int port) throws IOException {
        // Create a ServerSocket object to listen for incoming connections
        serverSocket = new ServerSocket(port);
        // Create a thread pool to handle multiple clients simultaneously
        executorService = Executors.newFixedThreadPool(10);
        System.out.println("Server listening on port " + port);
    }
//criar uma linked list e instanciar la dentro os new clienthandler e depois fazer o que é suposto, mandar msg do servidor para o client a confirmar.
    public void start() throws IOException {
        // Start accepting incoming connections
        //Created a linked list above, so i can instanciate and when the clientSocket accepts the client is created in a autonomous way
        //in the linkedList, then the executor takes care of them.
        linkedList = new LinkedList<>();
        while (true) {
            Socket clientSocket = serverSocket.accept();
            // Create a new ClientHandler object and add it to the linked list
            ClientHandler handler = new ClientHandler(clientSocket);
            linkedList.add(handler);
            // Start a new thread with the ClientHandler object
            executorService.execute(handler);


      /*  while (true) {
            Socket clientSocket = serverSocket.accept();
            // Create a new thread to handle the client
            linkedList = new LinkedList<>((ClientHandler));
           executorService.execute();

            // executorService.execute(new ClientHandler(clientSocket));
        }
     */
        }
    }
    private static class ClientHandler implements Runnable {

        private Socket clientSocket;
        private BufferedReader input;
        private PrintWriter output;

        public ClientHandler(Socket socket) throws IOException {
            // Get the input and output streams of the client socket
            clientSocket = socket;
            input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            output = new PrintWriter(clientSocket.getOutputStream(), true);
        }

        public void run() {
            Nomes randomName = Nomes.getRandomEnumName();
            try {
                // Print a message indicating a new client has connected
                System.out.println("New client connected: " + randomName );

                String message;
                // Read incoming messages from the client
                while ((message = input.readLine()) != null) {
                    // Print the received message and send a response back to the client
                    System.out.println("Received message from client " + randomName + ": " + message);
                    output.println("Server received message: " + message + " from the user: " + randomName);


                }


                // Print a message indicating the client has disconnected
                System.out.println("Client disconnected: " + randomName);

                // Close the input, output, and client socket
                input.close();
                output.close();
                clientSocket.close();

            } catch (IOException e) {
                // Print the stack trace if an IOException occurs
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // Create a new Server object and start listening for incoming connections

        Server server = new Server(4535);
        server.start();
    }
}