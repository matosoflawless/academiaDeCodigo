package houserules;

import java.util.prefs.BackingStoreException;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Bathroom bathroom = new Bathroom();

        Thread thread1 = new Thread(new Cadet("Gonçalo",bathroom));
        Thread thread2 = new Thread(new Cadet("Luigi",bathroom));
        Thread thread3 = new Thread(new Cadet("Vasco",bathroom));


        thread1.start();
        thread2.start();
        thread3.start();

    }
}
