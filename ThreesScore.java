public class ThreesScore extends Score {
	
	public ThreesScore(String name) {
		super(name, false);
	}
	

	public int calculateScore(int[] values) {
		return countdice(values, 3);
	}
}
