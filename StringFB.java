class StringFB {

    public static void main(String[] args) {

        String word = "heisenberg";
        
        if(args.length > 0) {
            word = args[0];
        }

        if(word.length() < 2) {
            System.out.println("Oh espertinho mete mais letras");
        }
        String mid = word.substring(1,word.length()-1);
        char first = word.charAt(0); // h
        char last = word.charAt(word.length()-1);  // g
        System.out.println(last + mid + first);
                            //eisenber
    }

}

//dada uma string, printar uma nova string onde a primeira e ultima letra
//foram trocadas ex; ola-> alo fred -> dref
//tenho que usar o index
//fazer um for para percorrer todas as letras
