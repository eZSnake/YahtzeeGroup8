import java.util.Arrays;

public abstract class Score {

    private String name;
    private int potentialScore, actualScore;
    private boolean isUsed;

    int countdice(int[] values, int val) {
        int num = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == val) {
                num++;
            }
        }
        return val*num;
    }

    public boolean nInARow(int[] values, int toCheck, boolean exact) {
        Arrays.sort(values);
        int inARow = 1;
        for (int i = 0; i < values.length-1; i++) {
            if (values[i] == values[i+1]) {
                inARow++;
            } else {
                inARow = 1;
            }
            if (inARow == toCheck) {
                if (exact) {
                    if (i == values.length-1 || values[i] != values[i+2]) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

     public Score(String name, boolean isUsed) {
        this.name = name;
        this.isUsed = isUsed;
    }

    public abstract int calculateScore(int[] values);

    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActualScore(int actualScore) {
        this.actualScore = actualScore;
    }

    public String getName() {
        return name;
    }

    public int getPotentialScore() {
        return potentialScore;
    }

    public void setPotentialScore(int potentialScore) {
        this.potentialScore = potentialScore;
    }

    public int getActualScore() {
        return actualScore;
    }

    public boolean getIsUsed() {
        return isUsed;
    }

}
