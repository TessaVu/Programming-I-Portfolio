package bloodborne;
public class Waste_of_Skin implements Bloodborne {
	public static final int level10 = 10;
	public static final int level4 = 4;
	public void description() {
		System.out.println(“You are nothing. Talentless. You shouldn’t have been born.”);
	}
	public double origin(double bloodEchoes, double level) {
		if (bloodEchoes > 9) {
			return level10;
		} else {
			return level4;
		}
	}
}