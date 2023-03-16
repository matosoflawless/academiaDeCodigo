import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    Socket socket;
    ServerSocket server;
    DataInputStream in;


    public Server(int port) throws IOException {

        server = new ServerSocket(port);
        System.out.println("Server Started");
        socket = server.accept();
        System.out.println("Client present");
        in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

        String line = "";

        while (!line.equals("stop")) {
            line = in.readUTF();
            System.out.println(line);
            socket.close();
            in.close();

        }
    }
        public static void main (String[]args) throws IOException {
            Server server = new Server(9001);

        }

    }




// Scanner = new Scanner(System.in)
//  while dos 2 lados que consiga fazer um processo e fique a espera do proximo passo
// while - in/out
