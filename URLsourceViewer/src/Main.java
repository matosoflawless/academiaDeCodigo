

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {








    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strUrl = reader.readLine();
        URL url = new URL(strUrl);

       BufferedInputStream in = new BufferedInputStream(url.openStream());
       InputStreamReader streamReader = new InputStreamReader(in);

        System.out.println(in);


    }
}