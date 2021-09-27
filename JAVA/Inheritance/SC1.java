package JAVA.Inheritance;

//circle and cylinder inheritance

class Circle {
    public int radius;

    public int area() {
        return (int) Math.PI * radius * radius;
    }

    public int perimeter() {
        return 2 * (int) Math.PI * radius;
    }
}

class Cylinder extends Circle {
    public int height;

    public int volume() {
        return area() * height;
    }
}

public class SC1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 3;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.radius);
        Cylinder c2 = new Cylinder();
        c2.height = 4;
        c2.radius = 3;
        System.out.println(c2.area());
        System.out.println(c2.volume());
        System.out.println(c2.height);
        System.out.println(c2.radius);
    }
}
