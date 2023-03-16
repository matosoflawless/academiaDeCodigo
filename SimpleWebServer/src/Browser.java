import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/*public class Browser {


    private Socket browserSocket;
    private ServerSocket serverSocket;
    private BufferedReader inputBufferedReader;

    public Browser(int port){

        try {

            // bind the socket to specified port
            System.out.println("Binding to port " + port);
            serverSocket = new ServerSocket(port);

            System.out.println("Server started: " + serverSocket);

            // block waiting for a client to connect
            System.out.println("Waiting for a browser connection");
            browserSocket = serverSocket.accept();


            // handle client connection
            System.out.println("Browser accepted: " + browserSocket);
            setupSocketStream();

            while (true) {

                try {

                    // read line from socket input reader
                    String line = inputBufferedReader.readLine();

                    // if received /quit close break out of the reading loop
                    if (line == null || line.equals("/quit")) {

                        System.out.println("Client closed, exiting");
                        break;

                    }

                    // show the received line to the console
                    System.out.println(line);

                } catch (IOException ex) {

                    System.out.println("Receiving error: " + ex.getMessage());

                }

            }
    } catch (IOException e) {
            throw new RuntimeException(e);
        }


        public void browserInputStream(){
            inputBufferedReader = new BufferedReader(new InputStreamReader())
        }

}
*/