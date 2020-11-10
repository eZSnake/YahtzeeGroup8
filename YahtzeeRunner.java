public class YahtzeeRunner {
    public static void main(String[] args) {
        YahtzeeGame myGame = new YahtzeeGame();
        for (int i = 0; i < 13; i++) {
            myGame.playRound();
        }
    }
}
