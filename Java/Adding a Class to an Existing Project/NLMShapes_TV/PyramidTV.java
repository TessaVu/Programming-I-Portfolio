// Tessa Vu 2.22.2017

public class PyramidTV {
    // Edit start.
    private double height, baseLength;
    public PyramidTV(double h, double b) {
        // Edit end.
        height = h;
        baseLength = b;
    }
    public double getSurfaceArea() {
        double sideLength = Math.sqrt(height * height + baseLength * baseLength / 4);
        double surfaceArea = 2 * sideLength * baseLength;
        return surfaceArea;
    }
    public double getVolume() {
        double volume = height * baseLength * baseLength / 3;
        return volume;
    }
}