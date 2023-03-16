import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

public class Server {

    private Socket browserSocket;
    private ServerSocket serverSocket;
    private BufferedReader inputBufferedReader;
    private DataOutputStream dataOut;
    private String favicon = "/favicon.ico";
    private String logo = "/logo.png";

    byte[] arrayByte = new byte[1024];

//class File capaz de manusear ficheiros.


    public Server(int port) throws IOException {


        try {

            // bind the socket to specified port
            System.out.println("Binding to port " + port);
            serverSocket = new ServerSocket(port);

            System.out.println("Server started: " + serverSocket);

            // block waiting for a client to connect
            System.out.println("Waiting for a browser connection");
            browserSocket = serverSocket.accept();


            // handle client connection
            System.out.println("Server accepted: " + browserSocket);
            browserInputStream();
            browserOutputStream();
            while (true) {


                try {

                    if(inputBufferedReader.readLine() == "GET/" + favicon + " HTTP/1.1" ||
                       inputBufferedReader.readLine() == "GET/" + logo + " HTTP/1.1"){
                            dataOut.write(arrayByte);

                        }
                    browserSocket = serverSocket.accept();
                    browserInputStream();
                    browserOutputStream();

                    } catch (IOException e) {
                    throw new RuntimeException(e);
                }


            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
        public void browserInputStream() throws IOException {
            inputBufferedReader = new BufferedReader(new InputStreamReader(browserSocket.getInputStream()));
            System.out.println(inputBufferedReader.readLine());
        }

        public void browserOutputStream() throws IOException {

            dataOut = new DataOutputStream(browserSocket.getOutputStream());


        }

/*
String path;
if(System.in == ("GET /" + path + "HTTP/1.1"){
browseroutputStream();
else{
return error 303
}
 */
}
