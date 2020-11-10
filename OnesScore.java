public class OnesScore extends Score {
	
	public OnesScore(String name) {
		super(name, false);
	}
	
	public int calculateScore(int[] values) {
//		int onesSum = 0;
//		for (int i = 0; i < values.length; i++) {
//			if (values[i] == 1) {
//				onesSum++;
//			}
//		}
//		return onesSum;
		return countdice(values, 1);
	}
}
