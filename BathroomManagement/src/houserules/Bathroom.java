package houserules;

public class Bathroom {

    private Toilet toilet;


    public Bathroom() {
        this.toilet = new Toilet();
    }


    public void enter() {
        System.out.println(Thread.currentThread().getName() + " enters on the toilet.");
    }

    public void washHands() {
        System.out.println(Thread.currentThread().getName() + " : is washing hands.");
    }


    public void exit(){
        System.out.println(Thread.currentThread().getName() + " ... leaves the bathroom.");
    }


    public void useToilet(){
        toilet.use();
    }
    private class Toilet {


        public synchronized void use() {

            System.out.println(Thread.currentThread().getName() + " unzips...");

            System.out.println(Thread.currentThread().getName() + " sits on the toilet.");

            System.out.println(Thread.currentThread().getName() + " is doing his thing.");

            System.out.println(Thread.currentThread().getName() + " ... is Done!\n");
        }
    }
    }

