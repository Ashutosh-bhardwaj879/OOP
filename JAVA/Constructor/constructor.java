package JAVA.Constructor;

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public Rectangle(int s) {
        length = breadth = s;
    }

    public int area() {
        return length * breadth;
    }
};

public class constructor {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        System.out.println(r1.area());
        Rectangle r2 = new Rectangle(10);
        System.out.println(r2.area());
        Rectangle r3 = new Rectangle();
        System.out.println(r3.area());
    }
}
