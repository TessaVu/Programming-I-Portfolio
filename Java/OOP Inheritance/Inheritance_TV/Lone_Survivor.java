package bloodborne;
public class Lone_Survivor implements Bloodborne {
	public static final int level10 = 10;
	public static final int level4 = 4;
	public void description() {
		System.out.println(“Lone survivor of a lost hamlet. High life essence and vigor.”);
	}
	public double origin(double bloodEchoes, double level) {
		if (bloodEchoes > 419) {
			return level10;
		} else {
			return level4;
		}
	}
}