public class ReverseString {

    // ONDE CORRE O PROGRAMA
    public static void main(String[] args) {
       String r = reverse("Luís Matos");
        System.out.println(r);
    }
 // Aqui, a string s, é o nosso texto
    public static String reverse(String s) {
        // declaro um array de letras que é do tamanho de da nossa string (.lenght)
        char[] letters = new char[s.length()];
        // crio uma variavel para index que começa em 0
        int letterIndex = 0;
        // faço um for para percorrer o array, mas digo que a .length vai ser -1, se fosse 0 ia dar erro
        //porque o systema conta com o 0 e nós queremos que ele vá guardando os caracteres do fim para o inicio
        for(int i = s.length() - 1; i >= 0; i--) {
        // aqui guardamos em letterIndex o caracter que o i está a percorrer
        letters[letterIndex] = (s.charAt(i));
        // aqui não esquecer que o for esta a contar do fim para o inicio ou seja quando incrementamos o
            //letterIndex de i basicamente adicionamos ao array a posiçao anterior de i ex : quando ele vai em 3
                // vai na palavra "dog" ele vai buscar o "d"
        letterIndex++;

    }
//aqui criamos uma string sem nada onde criamos um for para ele percorrer o array letters, que tem informaçao
        //guardada: que são os caracteres do fim para o inicio
String reversedText = "";
    for(int i = 0; i < s.length(); i++)
        //gg
        reversedText = reversedText + letters[i];


        return reversedText;
    }


}

