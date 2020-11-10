public class SixesScore extends Score {
	
	public SixesScore(String name){
		super(name, false);
	}
	
	public int calculateScore(int[] values) {
		return countdice(values, 6);
	}
}
