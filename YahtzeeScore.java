public class YahtzeeScore extends Score {

	public YahtzeeScore(String name) {
		super(name, false);
	}
	
	
	public int calculateScore(int[] values) {
		boolean Yahtzee = true;
		for (int i = 0; i < values.length-1; i++) {
			if (values[i] != values[i+1]) {
				return 0;
			}
		}
		return 50;
	}
}
