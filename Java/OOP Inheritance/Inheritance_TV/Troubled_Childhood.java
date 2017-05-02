package bloodborne;
public class Troubled_Childhood implements Bloodborne {
	public static final int level10 = 10;
	public static final int level4 = 4;
	public void description() {
		System.out.println(“Suffered misfortune in youth. Highly resilient as a result.”);
	}
	public double origin(double bloodEchoes, double level) {
		if (bloodEchoes > 359) {
			return level10;
		} else {
			return level4;
		}
	}
}