package org.academiadecodigo.light;

public class Character {

    String name;
    Integer power;
    String trans;





    public Character(String name, Integer power, String trans) {

        this.name = name;
        this.power = power;
        this.trans = trans;

    }

    public Integer getPower() {
        return power;
    }

    public String getTrans() {
        return trans;
    }

    public String getName() {
        return name;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public void setName(String name) {
        this.name = name;
    }

}