public class Player {

    public String name ; // nome do manito
    public int diceLaunch; // mathrandom
    public boolean winLoose; // se ganha ou perde


    public Player(String name, int diceLauch, boolean winLoose) {

        this.name = name;
        this.diceLaunch = diceLauch;
        this.winLoose = winLoose;

    }
    public  String getName() {
        return this.name;
    }
    public int getDiceLauch() {
        return this.diceLaunch;
    }
    public boolean getWinLoose() {
        return this.winLoose;
    }
    public void setName(String name) {
        this.name = name;

    }
    public void setDiceLauch(int diceLauch) {
        this.diceLaunch = diceLaunch;
    }
    public void setWinLoose(boolean winLoose) {
        this.winLoose = winLoose;

    }
    public void throw() static {
        int min = 1;
        int max = 3;
        int range = max - min + 1;
        int randomNum = (int)(Math.random() * range) + min;
        return this.randomNum;

    }
}
