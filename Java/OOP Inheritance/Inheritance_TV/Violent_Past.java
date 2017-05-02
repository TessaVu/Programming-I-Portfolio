package bloodborne;
public class Violent_Past implements Bloodborne {
	public static final int level10 = 10;
	public static final int level4 = 4;
	public void description() {
		System.out.println(“Terribly violent past. Rash, but stronger for it.”);
	}
	public double origin(double bloodEchoes, double level) {
		if (bloodEchoes > 179) {
			return level10;
		} else {
			return level4;
		}
	}
}