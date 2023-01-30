import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        // Instanciar o scanner
        Scanner myScanner = new Scanner(System.in);

        // Perguntar o nome
        System.out.println("Introduza um nome:");
        String name = myScanner.nextLine();

        // E pergunto a idade
        System.out.println("Idade?");
        Integer idade = myScanner.nextInt();
        int idadeIncrementada = aumentarIdade(idade);



        // Cuspir o resultado
        System.out.println("O teu nome é " + name + "E a sua idade é: " + idadeIncrementada);




    }

    //criação de função estatica de incrementaçao basica
    public static int aumentarIdade(int idade) {
        return idade + 10;
    }
}
