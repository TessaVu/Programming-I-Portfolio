public class boxCalc {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double height = 0;
		double length = 0;
		double width = 0;
		double volume = 0;
		double area = 0;
	System.out.println(“Please enter the height of the box: ”);
	System.out.println(“Please enter the length of the box: “);
	System.out.println(“Please enter the width of the box: “);
	h = in.nextDouble();
	l = in.nextDouble();
	w = in.nextDouble();
	getVolume = h * l * w;
	getSurfaceArea = 2 * ((l * w) + (h * l) + (h * w));
	System.out.println(“The volume for your box: ” + volume);
	System.out.println(“The surface area for your box: ” + area);
	}
}