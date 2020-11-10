import java.util.Arrays;

public class FullHouseScore extends Score {

	public FullHouseScore(String name) {
		super(name, false);
	}
	
	public int calculateScore(int[] values) {	
		if (nInARow(values, 3, true) && nInARow(values, 2, true)) {
			return 25;
		}
		return 0;
	}
}
