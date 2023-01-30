package org.academiadecodigo.light;

public class Main {

    public static void main(String[] args) {


        Character gokuCharacter = new Character("Goku",10,"Normal");
        Character krilCharacter = new Character("Krillin",11, "Normal");
        Character vegetaCharacter = new Character("Vegeta", 10,"Normal");
        Game dragonGame = new Game(gokuCharacter, krilCharacter, vegetaCharacter);
        System.out.println("Can you tell me all the attributes of the oldest character of Dragonball?");
        System.out.println("The name of the character is " + gokuCharacter.getName() + " and his power is " + gokuCharacter.getPower() + " and it´s in his " + gokuCharacter.getTrans() + " state");
        System.out.println("<<<<<<<<<<<<<WHAT HAPPENED????>>>>>>>>>>>>>>");
        System.out.println("--- " + gokuCharacter.getName() + " meets " + krilCharacter.getName() + " and starts fighting ---");
        dragonGame.fightEachOtherGokuKril(gokuCharacter, krilCharacter, vegetaCharacter);
        System.out.println("------ What is the transformation and the power of Goku after loose the fight? ------");
        System.out.println(gokuCharacter.getTrans() + " and " + gokuCharacter.getPower());

    }
}