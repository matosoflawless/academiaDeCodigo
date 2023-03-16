import java.io.*;
import java.net.Socket;

public class Client {

     //vamos inicializar a nossa socket
        // declaramos o nosso bufferedreader que vai ser o input e o dataout que vai ser o output
        //depois pegamos no input e mandamos para a socket usando a nossa socket

        Socket socket;
        BufferedReader input;
        DataOutputStream output;

        public Client(String adress,int port) throws IOException {
            socket = new Socket(adress,port);
            System.out.println("Connected");

            //preparamos o nosso imput reader
            input = new BufferedReader(new InputStreamReader(System.in));

            output = new DataOutputStream(socket.getOutputStream());

            String line = "";
           while (!line.equals("stop")) {

                line = input.readLine(); //le a linha que eu escrever
                output.writeUTF(line);

                input.close();
                output.close();
                socket.close();

            }
    }

    public static void main(String[] args) throws IOException {
        Client client = new Client("127.0.0.1",9001);
    }
}
