public class ChanceScore extends Score {
	
	public ChanceScore(String name) {
		super(name, false);
	}
	
	public int calculateScore(int[] values) {	
		int totSum = 0;
		for (int i = 0; i < values.length; i++) {
			totSum += values[i];
		}
		return totSum;
	} 
}
