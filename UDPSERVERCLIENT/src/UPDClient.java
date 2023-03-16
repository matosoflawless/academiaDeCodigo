import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UPDClient {
    public static void main(String[] args) throws IOException {

        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("127.0.0.1");

        String ex = "ioioioioioioioioioioioioioioioio";
        byte[] buf = ex.getBytes();

        DatagramPacket packet = new DatagramPacket(buf,buf.length, address, 9001);
        clientSocket.send(packet.getData());
    }
}

