public class FivesScore extends Score {
	
	public FivesScore(String name) {
		super(name, false);
	}
	
	public int calculateScore(int[] values) {
//		int fivesSum = 0;
//		for (int i = 0; i < values.length; i++) {
//			if (values[i] == 5) {
//				fivesSum++;
//			}
//		}
//		return 5*fivesSum;
		return countdice(values, 5);
	}
}
