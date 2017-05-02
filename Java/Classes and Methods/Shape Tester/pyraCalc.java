public class pyraVol {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		double height = 0;
		double length = 0;
		double width = 0;
		double volume = 0;
		double area = 0;
	System.out.println(“Please enter the height of the pyramid: ”);
	System.out.println(“Please enter the length of the pyramid: ”);
	System.out.println(“Please enter the width of the pyramid: “);
	h = in.nextDouble();
	l = in.nextDouble();
	w = in.nextDouble();
	getVolume = (length * width * height) / 3;
	getSurfaceArea = length * width + length * (Math.sqrt(Math.pow(width / 2)) + Math.pow(height))) + width * (Math.sqrt(Math.pow(length / 2) + Math.pow(height)));
	System.out.println(“The volume for your pyramid: ” + volume);
	System.out.println(“The surface area for your pyramid: “ + area);
	}
}