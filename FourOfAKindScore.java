import java.util.Arrays;

public class FourOfAKindScore extends Score {

	public FourOfAKindScore(String name) {
		super(name, false);
	}
	
	public int calculateScore(int[] values) {
		if (nInARow(values, 4, false)) {
			return 4*values[2];
		}
		return 0;
	}
}


