//represents collection of 5 dice
public class YahtzeeDice { //Eike Rehwald
    private Die[] dice = new Die[5];
    private boolean[] hold = new boolean[5];

    // Constructors
    public YahtzeeDice() { //constructs a YahtzeeDice object containing 5 default Die objects in the dice array.
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die();
        }
    }

    public YahtzeeDice(int numSides) { //constructs a Yahtzee object containing 5 Die objects with the given number of sides
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die(numSides);
        }
    }

    // Subroutines
    public int roll() { //rolls all 5 dice and returns the total of the dice
        int sum = 0;
        for (int i = 0; i < dice.length; i++) {
            sum += dice[i].roll();
        }
        return sum;
    }

    public Die[] getDice() { //returns the dice array
        return dice;
    }

    public int[] getDiceValues() { //returns an int[] containing the values of the 5 dice
        int[] ret = new int[dice.length];
        for (int i = 0; i < dice.length; i++) {
            ret[i] = dice[i].getCurrentValue();
        }
        return ret;
    }

    public String toString() { //returns a String representation of the object
//        String ret = "";
//        for (int i = 0; i < dice.length; i++) {
//            ret += " " + dice[i].toString();
//        }
//        return ret;
        String yahtzee = "The " + dice.length + " dice read: ";
        for(int i = 0; i < dice.length; i++) {
            if(i < dice.length - 1)
                yahtzee += dice[i].getCurrentValue() + ", ";
            else
                yahtzee += dice[i].getCurrentValue() + ".";
        }
        return yahtzee;
    }

    public void hold(int toHold) {
        hold[toHold] = true;
    }

    public void unhold(int toUnhold) {
        hold[toUnhold] = false;
    }

    public void rollHold() {
        for (int i = 0; i < dice.length; i++) {
            if (!hold[i]) {
                dice[i].roll();
            }
        }
    }
}
