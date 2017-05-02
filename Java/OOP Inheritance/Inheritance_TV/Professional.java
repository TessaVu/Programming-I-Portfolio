package bloodborne;
public class Professional implements Bloodborne {
	public static final int level10 = 10;
	public static final int level4 = 4;
	public void description() {
		System.out.println(“Born specialist, fit ofr sleuthing or academia.”);
	}
	public double origin(double bloodEchoes, double level) {
		if (bloodEchoes > 239) {
			return level10;
		} else {
			return level4;
		}
	}
}