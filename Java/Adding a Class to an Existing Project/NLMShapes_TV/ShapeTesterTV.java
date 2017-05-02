import java.util.Scanner;
public class ShapeTesterTV {
    public static void main(String[] args) {
        int boxW, boxL, boxH;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to shape maker! Lets find the volume and surface area for a few shapes...");
        System.out.println("Lets start with a box. Enter the width of box: ");
        boxW = scan.nextInt();
        System.out.println("Enter the length of box: ");
        boxL = scan.nextInt();
        System.out.println("Enter the height of box: ");
        boxH = scan.nextInt();
        Box box = new Box(boxW, boxL, boxH);
        System.out.println("Surface Area of Box: " + box.getSurfaceArea());
        System.out.println("Volume of Box: " + box.getVolume());
        int sphereR;
        System.out.println("Now a sphere. Enter radius of the sphere: ");
        sphereR = scan.nextInt();
        Sphere sphere = new Sphere(sphereR);
        System.out.println("Surface Area of Sphere: " + sphere.getSurfaceArea());
        System.out.println("Volume of Sphere: " + sphere.getVolume());
        int pyramidH, pyramidB;
        System.out.println("Now a square base pyramid. Enter height of the pyramid: ");
        pyramidH = scan.nextInt();
        System.out.println("Enter base length of the pyramid: ");
        pyramidB = scan.nextInt();
        Pyramid pyramid = new Pyramid(pyramidH, pyramidB);
        System.out.println("Surface Area of Pyramid: " + pyramid.getSurfaceArea());
        System.out.println("Volume of Pyramid: " + pyramid.getVolume());
        
        // Tessa Vu 2.22.2017
        
        // Edit start.
        int cylinderH, cylinderR;
        System.out.println("Now a cylinder. Enter the height of the cylinder: ");
        cylinderH = scan.nextInt();
        System.out.println("Enter radius of the cylinder: ");
        cylinderR = scan.nextInt();
        CylinderTV cylinder = new CylinderTV(cylinderH, cylinderR);
        System.out.println("Surface Area of Cylinder: " + cylinder.getSurfaceArea());
        System.out.println("Volume of Cylinder: " + pyramid.getVolume());
        //Edit end.
    }
}