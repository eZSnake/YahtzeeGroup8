public class Die {
    //instance variables - attributes Die objects will have
    private int currentValue, numSides; //default is 0

    //constructors
    public Die() {
        numSides = 6;
        currentValue = roll();
    }

    public Die(int sides) {
        numSides = sides;
        currentValue = roll();
    }

    public Die(int sides, int initialValue) {
        numSides = sides;
        currentValue = initialValue;
    }

    public String toString() {
        return "Sides: " + numSides + ", Value: " + currentValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    //instance methods - behaciors Die objects can do
    public int roll() {
        currentValue = (int)(Math.random()*numSides) + 1;
        return currentValue;
    }
}
