public class TwosScore extends Score {
	
	public TwosScore(String name) {
		super(name, false);
	}
	

	public int calculateScore(int[] values) {
/*		int twosSum = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == 2) {
				twosSum++;
			}
		}
		return 2*twosSum;*/
		return countdice(values, 2);
	}
}
