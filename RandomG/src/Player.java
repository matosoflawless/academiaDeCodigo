public class Player {

    int randomNum;

    public int giveGuess() {
            randomNum = (int) Math.floor(Math.random() * 10) +1;
            return randomNum;
    }

}
