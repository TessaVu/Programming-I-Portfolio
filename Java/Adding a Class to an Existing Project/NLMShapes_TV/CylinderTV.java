// Tessa Vu 2.22.2017

public class CylinderTV {
    private double height, radius;
        public CylinderTV(double h, r) {
            h = height;
            r = radius;
    }
    public double getSurfaceArea() {
        double surfaceArea = (2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2));
        return surfaceArea;
    }
    public double getVolume() {
        double volume = Math.PI * Math.pow(r, 2) * h;
        return volume;
    }
}