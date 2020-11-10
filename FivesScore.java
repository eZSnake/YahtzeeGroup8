public class FivesScore extends Score {
	
	public FivesScore(String name) {
		super(name, false);
	}
	
	public int calculateScore(int[] values) {
		return countdice(values, 5);
	}
}
