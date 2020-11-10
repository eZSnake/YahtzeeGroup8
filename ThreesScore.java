public class ThreesScore extends Score {
	
	public ThreesScore(String name) {
		super(name, false);
	}
	

	public int calculateScore(int[] values) {
//		int threesSum = 0;
//		for (int i = 0; i < values.length; i++) {
//			if (values[i] == 3) {
//				threesSum++;
//			}
//		}
//		return 3*threesSum;
		return countdice(values, 3);
	}
}
