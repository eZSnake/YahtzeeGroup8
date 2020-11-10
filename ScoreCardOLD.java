public class ScoreCardOLD {

    public void setScorecard() {
        Score[] scorecard = new Score[13];
        scorecard[0] = new OnesScore("Ones");
        scorecard[1] = new TwosScore("Twos");
        scorecard[2] = new ThreesScore("Threes");
        scorecard[3] = new FoursScore("Fours");
        scorecard[4] = new FivesScore("Fives");
        scorecard[5] = new SixesScore("Sixes");
        scorecard[6] = new ThreeOfAKindScore("Three of a Kind");
        scorecard[7] = new FourOfAKindScore("Four of a Kind");
        scorecard[8] = new FullHouseScore("Full Hosue");
        scorecard[9] = new SmallStraightScore("Small Straight");
        scorecard[10] = new LargeStraightScore("Large Straight");
        scorecard[11] = new YahtzeeScore("Yahtzee");
        scorecard[12] = new ChanceScore("Chance");
    }


    public void printScoreCard(Score[] scorecard) {
        System.out.printf("%-25s%-25s%-25s", "Score Type", "Potential Score", "Score");
        for (int i = 0; i < scorecard.length; i++) {
            System.out.printf("%-25b%-25b%-25b", scorecard[i].getName(), scorecard[i].getPotentialScore(), scorecard[i].getActualScore());
        }
    }
}
