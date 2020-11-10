import java.util.Arrays;

public class LargeStraightScore extends Score {
	
	public LargeStraightScore(String name) {
		super(name, false);
	}
	
	public int calculateScore(int[] values) {
		Arrays.sort(values);
		for (int i = 0; i < values.length-1; i++) {
			if (values[i]+1 != values[i+1]) {
				return 0;
			}
		}
		return 40;
	} 
}
