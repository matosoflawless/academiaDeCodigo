public class OrderingExample {
    private volatile boolean flag = false;

    public static void main(String[] args) {
        OrderingExample example = new OrderingExample();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                example.doSomething();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                example.doSomethingElse();
            }
        });
        t1.start();
        t2.start();
    }

    public void doSomething() {
        // do some work
        System.out.println("Thread 1: Finished doing something");
        flag = true;
    }

    public void doSomethingElse() {
        while (!flag) {
            // wait for flag to be set
        }
        // do some work
        System.out.println("Thread 2: Finished doing something else");
    }
}