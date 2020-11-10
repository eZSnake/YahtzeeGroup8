import java.util.Arrays;

public class SmallStraightScore extends Score {
	
	public SmallStraightScore(String name) {
		super(name, false);
	}
	
	
	public int calculateScore(int[] values) {
		Arrays.sort(values);
		boolean isStraight = true;
		for (int startCount = 0; startCount < 2; startCount++) {
			for (int i = startCount; i < values.length-(startCount+1); i++) {
				if (values[i]+1 != values[i+1]) {
					isStraight = false;
					break;
				}
			}
		}
		if (isStraight) {
			return 30;
		}
		return 0;
	} 
}
