import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //criar um metodo para fazer o ping
        //devo precisar de um constructor que recebe um ip




        System.out.println("Wikipedia is reachable: ");
        System.out.println(InetAddress.getByName("www.trekkadventure.com").isReachable(99999));
        System.out.println(InetAddress.getByName("www.trekkadventure.com").getHostAddress());


    }
}