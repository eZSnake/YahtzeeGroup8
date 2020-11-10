public class FoursScore extends Score {
	
	public FoursScore(String name) {
		super(name, false);
	}
	
	public int calculateScore(int[] values) {
		return countdice(values, 4);
	}
}
