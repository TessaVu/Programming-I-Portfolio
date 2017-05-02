package bloodborne;
public class Milquetoast implements Bloodborne {
	public static final int level10 = 10;
	public static final int level4 = 4;
	public void description() {
		System.out.println(“Ordinary happy upbringing. All attributes average.”);
	}
	public double origin(double bloodEchoes, double level) {
		if (bloodEchoes > 299) {
			return level10;
		} else {
			return level4;
		}
	}
}