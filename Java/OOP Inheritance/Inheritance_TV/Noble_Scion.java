package bloodborne;
public class Noble_Scion implements Bloodborne {
	public static final int level10 = 10;
	public static final int level4 = 4;
	public void description() {
		System.out.println(“Scion to a respectable line with faith in your pedigree.”);
	}
	public double origin(double bloodEchoes, double level) {
		if (bloodEchoes > 539) {
			return level10;
		} else {
			return level4;
		}
	}
}