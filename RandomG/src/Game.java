public class Game {

   int numberToGuess;
   Player player1;
   Player player2;
    int numberOfPlays = 3;
   public Game (Player player1,Player player2) {
       this.player1 = player1;
       this.player2 = player2;

   }

    public int guessSecretNum() {
        numberToGuess = (int) Math.floor(Math.random() * 10)+1;
        return numberToGuess;
    }

    public void verifyWin(Player player1, Player player2, Game game) {


       for (int i=0; i <= numberOfPlays -1; i++) {



           if (player1.giveGuess() != game.guessSecretNum() && player2.giveGuess() != game.guessSecretNum()) {
               System.out.println("Player 1 picks : " + player1.giveGuess() + " and player 2 picks : " + player2.giveGuess());
               System.out.println("The game number was : " + game.guessSecretNum() + " so both loose!");
           } else if (player1.giveGuess() == game.guessSecretNum() && player2.giveGuess() == game.guessSecretNum()) {
               System.out.println("Player 1 picks : " + player1.giveGuess() + " and player 2 picks : " + player2.giveGuess());
               System.out.println("The game number was : " + game.guessSecretNum() + " so both win!");
           } else if (player1.giveGuess() == game.guessSecretNum() && player2.giveGuess() != game.guessSecretNum()) {
               System.out.println("Player 1 picks : " + player1.giveGuess() + " and player 2 picks : " + player2.giveGuess());
               System.out.println("The game number was : " + game.guessSecretNum() + " so congratz player 1!");
           } else if (player1.giveGuess() != game.guessSecretNum() && player2.giveGuess() == game.guessSecretNum()) {
               System.out.println("Player 1 picks : " + player1.giveGuess() + " and player 2 picks : " + player2.giveGuess());
               System.out.println("The game number was : " + game.guessSecretNum() + " so congratz player 2!");
           }

       }

    }
    }