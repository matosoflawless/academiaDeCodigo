package houserules;

public class Cadet implements Runnable{


    private String name;
    private Bathroom bathroom;

    public Cadet(String name, Bathroom bathroom) {
        this.name = name;
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        //codigo que eu quero que corra de forma independente na thread.
        Thread.currentThread().setName(name);
        bathroom.enter();
        bathroom.useToilet();
        bathroom.washHands();
        bathroom.exit();


    }


}
