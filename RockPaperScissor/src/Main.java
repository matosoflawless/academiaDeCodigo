public class Main {

    static int score1 = 0;
    static int score2 = 0;
static int counter = 1;
    public static void main(String[] args) {
        Player player1 = new Player("Joel");
        Player player2 = new Player("Elsa");
        System.out.println("Primeiro jogador : " + player1.getName());
        System.out.println("Segundo jogador : " + player2.getName());
        while (score1 < 3 && score2 < 3) {


                mainPlay(player1, player2);
            }
        }



    public static void mainPlay(Player player1, Player player2) {
        System.out.println("Jogada: " + counter);
        Jogada jogada1 = player1.doPlay();
        System.out.println("O jogador 1 jogou : " + jogada1);
        Jogada jogada2 = player2.doPlay();
        System.out.println("O jogador 2 jogou : " + jogada2);
        Jogada.whoWins(jogada1, jogada2);
        int whoWinsNumber = Jogada.whoWins(jogada1, jogada2);
        switch (whoWinsNumber) {
            case 1:
                score1++;
                break;
            case 2:
                score2++;
                break;
            default:

        }
        System.out.println(score1 + " / " + score2);
        counter++;
    }
}

