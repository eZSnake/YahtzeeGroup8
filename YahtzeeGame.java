//template for game objects
public class YahtzeeGame {
    private Score[] scorecard = new Score[13];
    private YahtzeeDice dice = new YahtzeeDice();

    YahtzeeGame() {
        scorecard[0] = new OnesScore("Ones");
        scorecard[1] = new TwosScore("Twos");
        scorecard[2] = new ThreesScore("Threes");
        scorecard[3] = new FoursScore("Fours");
        scorecard[4] = new FivesScore("Fives");
        scorecard[5] = new SixesScore("Sixes");
        scorecard[6] = new ThreeOfAKindScore("Three of a Kind");
        scorecard[7] = new FourOfAKindScore("Four of a Kind");
        scorecard[8] = new FullHouseScore("Full House");
        scorecard[9] = new SmallStraightScore("Small Straight");
        scorecard[10] = new LargeStraightScore("Large Straight");
        scorecard[11] = new YahtzeeScore("Yahtzee");
        scorecard[12] = new ChanceScore("Chance");
    }

    public void playRound() {
        int turn = 3;
        boolean rollAgain = true;
        for (int i = 0; i < 5; i++) {
            dice.unhold(i);
        }
        System.out.println("You have a maximum of 3 rolls per round.");
        while (rollAgain && turn > 0) {
            System.out.println("Rolling...");
            dice.rollHold();
            System.out.println(dice.toString());
            turn--;
            if (turn == 0) {
                continue;
            }
            for (int i = 0; i < 5; i++) {
                System.out.print("Would you like to save die " + (i+1) + " with a value of " + dice.getDiceValues()[i] + "? (y/n): ");
                if (TextIO.getlnString().toLowerCase().equals("y")) {
                    dice.hold(i);
                } else {
                    dice.unhold(i);
                }
            }
            System.out.println("You have " + turn + " turn(s) left this round");
            System.out.print("Would you like to roll again? (y/n): ");
            if (TextIO.getlnString().toLowerCase().equals("n")) {
                rollAgain = false;
            }
        }
        for (int i = 0; i < 13; i++) {
            if (!scorecard[i].getIsUsed()) {
                scorecard[i].setPotentialScore(scorecard[i].calculateScore(dice.getDiceValues()));
            }
        }
        printScoreCard();
        boolean succSave = false;
        while (!succSave) {
            System.out.print("Which score would you like to save? (enter name or number): ");
            String save = TextIO.getlnString().toLowerCase();
            succSave = saveScore(save);
        }
        System.out.print("Your score is " + getCurrentScore(scorecard));
        System.out.println("\nNext Turn\n");
    }

    private void printScoreCard() {
        System.out.printf("%-25s%-25s%-25s\n", "Score Type", "Potential Score", "Score");
        for (int i = 0; i < scorecard.length; i++) {
            System.out.printf("%3d. %-25s%-25d%-25d\n", (i+1), scorecard[i].getName(), scorecard[i].getPotentialScore(), scorecard[i].getActualScore());
        }
    }

    private boolean saveScore(String save) {
        if ("ones".equals(save) || "1".equals(save)) {
            if (!scorecard[0].getIsUsed()) {
                scorecard[0].setActualScore(scorecard[0].calculateScore(dice.getDiceValues()));
                scorecard[0].setIsUsed(true);
                return true;
            }
            return false;
        } else if ("twos".equals(save) || "2".equals(save)) {
            if (!scorecard[1].getIsUsed()) {
                scorecard[1].setActualScore(scorecard[1].calculateScore(dice.getDiceValues()));
                scorecard[1].setIsUsed(true);
                return true;
            }
            return false;
        } else if ("threes".equals(save) || "3".equals(save)) {
            if (!scorecard[2].getIsUsed()) {
                scorecard[2].setActualScore(scorecard[2].calculateScore(dice.getDiceValues()));
                scorecard[2].setIsUsed(true);
                return true;
            }
            return false;
        } else if ("fours".equals(save) || "4".equals(save)) {
            if (!scorecard[3].getIsUsed()) {
                scorecard[3].setActualScore(scorecard[3].calculateScore(dice.getDiceValues()));
                scorecard[3].setIsUsed(true);
                return true;
            }
            return false;
        } else if ("fives".equals(save) || "5".equals(save)) {
            if (!scorecard[4].getIsUsed()) {
                scorecard[4].setActualScore(scorecard[4].calculateScore(dice.getDiceValues()));
                scorecard[4].setIsUsed(true);
                return true;
            }
            return false;
        } else if ("sixes".equals(save) || "6".equals(save)) {
            if (!scorecard[5].getIsUsed()) {
                scorecard[5].setActualScore(scorecard[5].calculateScore(dice.getDiceValues()));
                scorecard[5].setIsUsed(true);
                return true;
            }
            return false;
        } else if ("three of a kind".equals(save) || "7".equals(save)) {
            if (!scorecard[6].getIsUsed()) {
                scorecard[6].setActualScore(scorecard[6].calculateScore(dice.getDiceValues()));
                scorecard[6].setIsUsed(true);
                return true;
            }
            return false;
        } else if ("four of a kind".equals(save) || "8".equals(save)) {
            if (!scorecard[7].getIsUsed()) {
                scorecard[7].setActualScore(scorecard[7].calculateScore(dice.getDiceValues()));
                scorecard[7].setIsUsed(true);
                return true;
            }
            return false;
        } else if ("full house".equals(save) || "9".equals(save)) {
            if (!scorecard[8].getIsUsed()) {
                scorecard[8].setActualScore(scorecard[8].calculateScore(dice.getDiceValues()));
                scorecard[8].setIsUsed(true);
                return true;
            }
            return false;
        } else if ("small straight".equals(save) || "10".equals(save)) {
            if (!scorecard[9].getIsUsed()) {
                scorecard[9].setActualScore(scorecard[9].calculateScore(dice.getDiceValues()));
                scorecard[9].setIsUsed(true);
                return true;
            }
            return false;
        } else if ("large straight".equals(save) || "11".equals(save)) {
            if (!scorecard[10].getIsUsed()) {
                scorecard[10].setActualScore(scorecard[10].calculateScore(dice.getDiceValues()));
                scorecard[10].setIsUsed(true);
                return true;
            }
            return false;
        } else if ("yahtzee".equals(save) || "12".equals(save)) {
            if (!scorecard[11].getIsUsed()) {
                scorecard[11].setActualScore(scorecard[11].calculateScore(dice.getDiceValues()));
                scorecard[11].setIsUsed(true);
                return true;
            }
            return false;
        }
        if (!scorecard[12].getIsUsed()) {
            scorecard[12].setActualScore(scorecard[12].calculateScore(dice.getDiceValues()));
            scorecard[12].setIsUsed(true);
            return true;
        }
        return false;
    }
    
    private int getCurrentScore(Score[] scorecard) {
        int sum = 0;
        for (int i = 0; i < 13; i++) {
            sum += scorecard[i].getActualScore();
        }
        return sum;
    }
    
    public String printScore() {
        return "Your final score is " + getCurrentScore(scorecard) + ".";
    }
}
