import java.util.Arrays;

public class ThreeOfAKindScore extends Score {
	
	public ThreeOfAKindScore(String name) {
		super(name, false);
	}

	public int calculateScore(int[] values) {
		if (nInARow(values, 3, false)) {
			return 3*values[2];
		}
		return 0;
	}
}

