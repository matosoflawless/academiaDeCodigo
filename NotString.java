import javax.swing.plaf.synth.SynthUI;

class NotString {
    public static void main(String[] args) {

        String word = "semicolon";

        if (args.length > 0) {
            word = args[0];
        }
        
        // ver se ela começa com not ou nao.
        // se começar faço print à palavra unchanged
        // senao começar adiciono à palavra not no inicio
        
        System.out.println(word.startsWith("not ") ? word : "not " + word);

    }
}
