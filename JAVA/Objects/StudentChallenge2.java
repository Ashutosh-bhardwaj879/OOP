package JAVA.Objects;

class Cylinder {
    public int radius;
    public int height;

    public int lidArea() {
        return (int) (Math.PI * radius * radius);
    }

    public int totalSurfaceArea() {
        return 2 * (int) Math.PI * radius * (height + radius);
    }

    public int curvedSurfaceArea() {
        return 2 * (int) Math.PI * radius * height;
    }

    public int Volume() {
        return (int) Math.PI * radius * radius * height;
    }
}

public class StudentChallenge2 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.radius = 2;
        c.height = 3;
        System.out.println(c.Volume());
        System.out.println(c.curvedSurfaceArea());
        System.out.println(c.lidArea());
        System.out.println(c.totalSurfaceArea());
    }
}
