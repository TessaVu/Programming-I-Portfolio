package bloodborne;
public class Military_Veteran implements Bloodborne {
	public static final int level10 = 10;
	public static final int level4 = 4;
	public void description() {
		System.out.println(“Experienced in war. A soldier with strength and skill.”);
	}
	public double origin(double bloodEchoes, double level) {
		if (bloodEchoes > 319) {
			return level10;
		} else {
			return level4;
		}
	}
}