public class TwosScore extends Score {
	
	public TwosScore(String name) {
		super(name, false);
	}
	

	public int calculateScore(int[] values) {
		return countdice(values, 2);
	}
}
