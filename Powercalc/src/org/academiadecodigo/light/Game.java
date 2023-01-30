package org.academiadecodigo.light;

public class Game {

    Character character;
    Character character1;
    Character character2;

    public Game(Character character, Character character1, Character character2) {

        this.character = character;
        this.character1 = character1;
        this.character2 = character2;

    }

    public void fightEachOtherGokuKril(Character gokuCharacter, Character krilCharacter, Character vegetaCharacter) {

        if (gokuCharacter.power < krilCharacter.power){

            gokuCharacter.setTrans("SuperSayanSayandjin");
            gokuCharacter.setPower(40);
            krilCharacter.setPower(0);
            krilCharacter.setTrans("Exhausted");
        }

        System.out.println("Krillin is " + krilCharacter.getTrans() + " and he defeated " + gokuCharacter.getName() + " and his power raised to " + gokuCharacter.getPower() + " cause his mad but then " + vegetaCharacter.getName() + " came and killed " + krilCharacter.getName() + " and " + gokuCharacter.getName() + " GOES NUTTS");
        fightTryHard(gokuCharacter, krilCharacter);

    }

    public void fightTryHard(Character gokuCharacter, Character krilCharacter){

        gokuCharacter.setPower(999999999);
        krilCharacter.setPower(-999999999);
        System.out.println("The power of goku is: " + gokuCharacter.getPower() + " and the power of kril is: " + krilCharacter.getPower() + " and he ded");

    }

}
