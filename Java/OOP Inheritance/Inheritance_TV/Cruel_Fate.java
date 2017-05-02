package bloodborne;
public class Cruel_Fate implements Bloodborne {
	public static final int level10 = 10;
	public static final int level4 = 4;
	public void description() {
		System.out.println(“Faced terrible hardships, but now confident in your purpose.”);
	}
	public double origin(double bloodEchoes, double level) {
		if (bloodEchoes > 499) {
			return level10;
		} else {
			return level4;
		}
	}
}