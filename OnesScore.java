public class OnesScore extends Score {
	
	public OnesScore(String name) {
		super(name, false);
	}
	
	public int calculateScore(int[] values) {
		return countdice(values, 1);
	}
}
