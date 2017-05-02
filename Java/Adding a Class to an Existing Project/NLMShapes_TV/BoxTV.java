//Tessa Vu 2.22.2017

public class BoxTV {
    // Edit start.
    private double height, length, width;
    public BoxTV(double w, double l, double h) {
        // Edit end.
        width = w;
        length = l;
        height = h;
    }
    public double getSurfaceArea() {
        double surfaceArea = 2 * (length * height + width * height);
        return surfaceArea;
    }
    public double getVolume() {
        double volume = length * width * height;
        return volume;
    }
}