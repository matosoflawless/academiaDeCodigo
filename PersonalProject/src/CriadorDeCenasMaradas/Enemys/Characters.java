package CriadorDeCenasMaradas.Enemys;

public abstract class Characters {

    public
    String name;
    public int hp;
    public int maxHp;
    public int xp;
    public int mana;

//constructor
    public Characters(String name, int maxHp, int mana, int xp) {
        this.name = name;
        this.hp = maxHp;
        this.mana = mana;
        this.maxHp = maxHp;
        this.xp = xp;


    }
    public abstract int attack();
    public abstract int defend();


}
