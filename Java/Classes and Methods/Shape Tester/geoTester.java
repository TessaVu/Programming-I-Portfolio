public class geoTester {
	public static void main(String[] args) {
		Scanner cl = new Scanner(System.cl);
		System.out.println(“Radius: “);
		double r = cl.nextDouble();
		System.out.println(“Height: “);
		double h = cl.nextDouble();
		System.out.println(“Length: ”);
		double l = cl.nextDouble();
		System.out.println(“Width: ”);
		double w = cl.nextDouble();
		System.out.println(“Box Volume: “ + boxCalc.getVolume(h, l , w));
		System.out.println(“Box Surface Area: “ + boxCalc.getSurfaceArea(h, l, w));
		System.out.println(“Sphere Volume: “ + sphereCalc.getVolume(r));
		System.out.println(“Sphere Surface Area: “ + sphereCalc.getSurfaceArea(r));
		System.out.println(“Pyramid Volume: ” + pyraCalc.getVolume(h, l, w));
		System.out.println(“Pyramid Surface Area: “ + pyraCalc.getSurfaceArea(h,l, w));
	}
}