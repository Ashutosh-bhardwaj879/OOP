package JAVA.Objects;

class Circle1 {
    public double r;

    public double area() {
        return Math.PI * r * r;
    }

    public double perimeter() {
        return Math.PI * r * 2;
    }

    public double circumference() {
        return perimeter();
    }
}

public class Circle {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1();
        c1.r = 3;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());
        c1.r = 7;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());
    }
}
