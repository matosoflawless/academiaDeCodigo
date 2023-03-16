public class Main {
    public static void main(String[] args) throws InterruptedException {



        for(int i=0; i<10; i++) {
            Thread thread = new Thread(new MyThread());
            thread.setName("Thread" + i);
            thread.start();
            thread.setPriority(2);
            System.out.println(thread.getState());
            thread.join();
            thread.setDaemon(true);


        }
    }
}