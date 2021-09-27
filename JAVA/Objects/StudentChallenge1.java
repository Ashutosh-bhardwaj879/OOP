package JAVA.Objects;

//rectnagle
class Rectangle {
    public int length;
    public int breadth;

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }
    public boolean isSquare() {
        return (length == breadth);
    }
}

public class StudentChallenge1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length =  3;
        r.breadth =  4;
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(r.isSquare());
    }
}
