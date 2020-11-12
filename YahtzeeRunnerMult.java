public class YahtzeeRunnerMult {
    public static void main(String[] args) {
        System.out.print("How many players would you like? ");
        int players = 0;
        while (players < 1) {
            players = TextIO.getlnInt();
        }
        YahtzeeGame[] myGame = new YahtzeeGame[players];
        for (int i = 0; i < players; i++) {
            myGame[i] = new YahtzeeGame();
        }
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < players; j++) {
                System.out.println("Player " + (j+1) + "'s turn");
                myGame[j].playRound();
            }
        }
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i+1) +": " + myGame[i].printScore());
        }
    }
}
