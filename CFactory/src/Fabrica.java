public class Fabrica {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Gerente : à espera que estes caralhos acabem");

        Thread trabalhador = new Thread(new Trabalhador());
        trabalhador.start();


            trabalhador.join();
            System.out.println("Gerente : finalmente acabaram, até já");
        }
        }



