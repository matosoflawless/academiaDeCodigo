public class Player {

    //Variáveis de instancia
    private String name;



    //Construtor
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public Jogada doPlay() {

        // sacar um numero entre 1-3 e se for 1 trimba se for 2 trimba e se for 3 trimba
        int randomNumForPlay = Utils.getRandomNumberBetween(1,3);
        switch (randomNumForPlay) {
            case 1:
                return Jogada.PAPER;
            case 2:
                return Jogada.ROCK;
            default:
                return Jogada.SCISSORS;
        }

    }
}
