import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringSetInputScanner;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Prompt prompt = new Prompt(System.in, System.out);
        System.out.println("Welcome to your first Prompt-View Experience!\n\n");

        System.out.println("Insert your credential below: \n\n");

        Set<String> username = new HashSet<>();
        username.add("matoso");
        StringSetInputScanner scannerUser = new StringSetInputScanner(username);
        scannerUser.setMessage("Username: ");
        scannerUser.setError("Username incorrect");
        prompt.getUserInput(scannerUser);
        System.out.println("Your username is correct!");


        Set<String> correctPassword = new HashSet<>();
        correctPassword.add("tomates");
        StringSetInputScanner scannerPass = new StringSetInputScanner(correctPassword);
        scannerPass.setMessage("Password: ");
        scannerPass.setError("Password incorrect");
        prompt.getUserInput(scannerPass);
        System.out.println("Your password is correct!");






    }
}