public class FoursScore extends Score {
	
	public FoursScore(String name) {
		super(name, false);
	}
	
	public int calculateScore(int[] values) {
//		int foursSum = 0;
//		for (int i = 0; i < values.length; i++) {
//			if (values[i] == 4) {
//				foursSum++;
//			}
//		}
//		return 4*foursSum;
		return countdice(values, 4);
	}
}
