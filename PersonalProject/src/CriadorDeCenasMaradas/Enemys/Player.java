package CriadorDeCenasMaradas.Enemys;

import CriadorDeCenasMaradas.GameLogic;

import java.util.LinkedList;

public class Player extends Characters {

    public   int numDefSkills;
    public int numAtkSkills;

    public String[] defSkills = {"Divine Protection", "Glory of the Paladin", "Titan grip", "Stone Armor", "Defensive Curl"};
    public String[] atkSkills = {"Blade of Andrea", "Matoso´s Fury", "Hammer of Justice", "Dick in the hole", "Black Rose"};


    //Constructor do player
    public Player(String name) {
        //Chamar o constructor da superclass characters
        super(name, 200, 100, 0);
        this.numDefSkills = 0;
        this.numAtkSkills = 0;
        chooseTrait();
    }


    //Métodos que tenho de usar por isto vir de uma super class
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }

    public void chooseTrait() {
        GameLogic.clearConsole(); //Limpa a consola
        GameLogic.printHeading("Choose a trait!: "); //Dá um titulo, método da classe gamelogic.
        System.out.println("(1) " + atkSkills[numAtkSkills]);
        System.out.println("(2) " + defSkills[numDefSkills]);
        int input = GameLogic.readInt("->", 2);
        if (input == 1) {
            GameLogic.printHeading("You choose " + atkSkills[numAtkSkills] + "!");
            numAtkSkills++;
        } else {
            GameLogic.printHeading("You choose " + defSkills[numDefSkills] + "!");
            numDefSkills++;
        }
        GameLogic.anythingToContinue();
    }
}
