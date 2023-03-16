import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client implements Runnable {
    private String command;

    private Socket socket;
    private BufferedReader input;
    private PrintWriter output;
    private ExecutorService executorService;
    private Thread clientThread;

    private Scanner scanner = new Scanner(System.in);

    //He creates a client here giving parametring the adress and the port, we also create his bufferedreader and his
    //printwriter giving as parameters for in put a new bufferedreader with a imputstreamreader(with: the socket from client .getInputstream
    //and then the output so i create a new printwriter(with: socket mais getoutputstream
    //atribuo tambem ao meu executerservice um numero de threads fixas, neste caso 10, usando o Runnable
    public Client(String address, int port) throws IOException {
        socket = new Socket(address, port);
        input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        output = new PrintWriter(socket.getOutputStream(), true);
        executorService = Executors.newFixedThreadPool(10);
        System.out.println("Connected to server.");
    }

    @Override
    public void run() {
        // start a separate thread to read messages from the server
        //
        executorService.execute(new ServerListener());

        while (true) {
            // read user input
            System.out.println("Escreva uma mensagem: \n");
            String message = scanner.nextLine();

            // send message to server
            output.println(message);




        }
    }

    // separate thread to read messages from the server


    public void start() {
        if (clientThread == null) {
            clientThread = new Thread(this);
            clientThread.start();
        }

    }

    public void stop() {
        try {
            executorService.shutdown();
            socket.close();
            input.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Client client = new Client("127.0.0.1", 4535);

        // Start the client on a separate thread
        client.start();

       // Wait for the user to input a specific command to stop the client

        while (true) {
            String command = command.nextLine();
            if (command.equals("exit")) {
                client.stop();
                break;
            }
        }
    }
    private class ServerListener implements Runnable {
        public void run() {
            try {
                String message;
                while ((message = input.readLine()) != null) {
                    System.out.println(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

