package CriadorDeCenasMaradas;

import CriadorDeCenasMaradas.Enemys.Player;

import java.util.EmptyStackException;
import java.util.Scanner;

public class GameLogic {
    public static boolean isRunning;
    static Player player;
    static Scanner scanner = new Scanner(System.in);


    //metodo para intruduzirmos inputs na consola

    public static int readInt(String prompt, int userChoices) {
        int input;
        String oi = "put numbers";
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter a integer!");
            }
        } while (input < 1 || input > userChoices);

        return input;

    }


    public static void clearConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    public static void printSeparator(int n) {
        for (int i = 0; i < n; i++)
            System.out.println("-");
        System.out.println();
    }

    public static void printHeading(String title) {
        printSeparator(3);
        System.out.println(title);
        printSeparator(3);
    }

    public static void anythingToContinue() {
        System.out.println("\nEnter anything to continue ... ");
        scanner.next();
    }

    public static void startGame() {
        boolean nameSet = false;
        String name;
        //Printar o start menu
        clearConsole();
        printSeparator(3);
        printSeparator(2);
        System.out.println("The game that will teach me");
        System.out.println("Written and made by MatosoFlawless");
        printSeparator(3);
        printSeparator(2);
        anythingToContinue();
        do {
            clearConsole();
            printHeading("Whats your name?");
            name = scanner.next();
            //Perguntar ao player se escolheu bem o nome
            clearConsole();
            printHeading("Your name is" + name + ".\nIs that correct?");
            System.out.println("(1) -> Yes ");
            System.out.println("(2) -> No, i want to change my name. ");
            int input = readInt("->", 2);
            if (input == 1)
                nameSet = true;
        } while (!nameSet);
        player = new Player(name);
        isRunning = true;
        gameloop();
    }
    //method para continuar a journey, também estático


    //info do character
    public static void characterInfo() {
        clearConsole();
        printHeading("CHARACTER INFO");
        System.out.println(player.name +"Total HP: " + player.hp + "/" + player.maxHp + " Mana: " + player.mana);
        printSeparator(3);
        System.out.println("XP: " + player.xp);

        if (player.numAtkSkills > 0) {
            System.out.println("Offensive trait : " + player.atkSkills[player.numAtkSkills -1]);
        }
    }

    //print do main menu
    public static void printMenu(){
        clearConsole();
        printHeading("MENU");
        System.out.println("Choose an action");
        printSeparator(3);
        System.out.println("(1) Continue on your journey");
        System.out.println("(2) Character info");
        System.out.println("(3) Exit Game");
    }

    public static void continueJourney(){

    }
    
    //main game loop
        public static void gameLoop(); {
            while ((isRunning)) {
                printMenu();
                int input = readInt("->", 3);
                if (input == 1)
                    continueJourney();
                else if (input == 2)
                    characterInfo();
                else
                    isRunning = false;
            }
        }
    }




