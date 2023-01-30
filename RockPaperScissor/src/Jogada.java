public enum Jogada {

    ROCK,
    PAPER,
    SCISSORS;

//0 tie / 1 player1 wins/  2 player2 wins
    int set;


    public static int whoWins(Jogada jogadaPlayer1, Jogada jogadaPlayer2) {

        if (jogadaPlayer1 == Jogada.ROCK && jogadaPlayer2 == Jogada.PAPER) {
            return 2;
        } else if (jogadaPlayer1 == Jogada.ROCK && jogadaPlayer2 == Jogada.SCISSORS) {
            return 1;
        } else if (jogadaPlayer1 == Jogada.ROCK && jogadaPlayer2 == Jogada.ROCK) {
            return 0;
        } else if (jogadaPlayer1 == Jogada.PAPER && jogadaPlayer2 == Jogada.SCISSORS) {
            return 2;
        } else if (jogadaPlayer1 == Jogada.PAPER && jogadaPlayer2 == Jogada.PAPER) {
            return 0;
        } else if (jogadaPlayer1 == Jogada.PAPER && jogadaPlayer2 == Jogada.ROCK) {
            return 1;
        } else if (jogadaPlayer1 == Jogada.SCISSORS && jogadaPlayer2 == Jogada.SCISSORS) {
            return 0;
        } else if (jogadaPlayer1 == Jogada.SCISSORS && jogadaPlayer2 == Jogada.PAPER) {
            return 1;
        }

        return 2;
    }
}
    /*
    System.out.println("Player 2 wins the round");
    System.out.println("Player 1 wins the round");
    System.out.println("It´s a tie");
    // resultados possiveis
    // player1 = rock and player2 = paper === player 2 wins
    // player1 = rock and player2 = scissor === player 1 wins
    // player1 = rock and player2 = rock === tie
    // player1 = paper and player2 = paper === tie
    // player1 = paper and player2 = scissor === player 2 wins
    // player1 = paper and player2 = rock === player 1 wins
    // player1 = scissor and player2 = paper === player 1 wins
    // player1 = scissor and player2 = scissor === tie
    // player1 = scissor and player2 = rock === player 2 wins
*/

