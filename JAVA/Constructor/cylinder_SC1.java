package JAVA.Constructor;

class Cylinder {
    private int radius;
    private int height;

    public Cylinder() {
        radius = 1;
        height = 1;
    }

    public Cylinder(int r, int h) {
        radius = r;
        height = h;
    }

    /*
     * public void setRadius(int r) { radius = r; }
     * 
     * public void setHeight(int h) { height = h; }
     */

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public int volume() {
        return (int) Math.PI * radius * radius * height;
    }
}

public class cylinder_SC1 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
        System.out.println(c1.volume());
        Cylinder c2 = new Cylinder(10, 5);
        System.out.println(c2.getHeight());
        System.out.println(c2.getRadius());
        System.out.println(c2.volume());
    }
}
