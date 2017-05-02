public class sphereCalc {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double radius = 0;
		double volume = 0;
		double area = 0;
	System.out.println(“Please enter the radius of the sphere: “);
	r = in.nextDouble();
	getVolume = (4 * 22 * r * r * r)/(3 * 7);
	getSurfaceArea = 4 * Math.PI * Math.pow(r, 2);
	System.out.println(“The volume for your sphere: “ + volume);
	System.out.println(“The surface area for your sphere: ” + area);
	}
}