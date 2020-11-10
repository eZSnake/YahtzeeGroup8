public class SixesScore extends Score {
	
	public SixesScore(String name){
		super(name, false);
	}
	
	public int calculateScore(int[] values) {
//		int sixsSum = 0;
//		for (int i = 0; i < values.length; i++) {
//			if (values[i] == 6) {
//				sixsSum++;
//			}
//		}
//		return sixsSum;
		return countdice(values, 6);
	}
}
