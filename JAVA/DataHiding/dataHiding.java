package JAVA.DataHiding;

class Rectangle {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setLength(int l) {
        length = l;
    }

    public void setBreadth(int b) {
        breadth = b;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length == breadth;
    }
}

public class dataHiding {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(5);
        r.setBreadth(5);
        System.out.println("Breadth : " + r.getBreadth());
        System.out.println("Length : " + r.getLength());
        System.out.println("Area : " + r.area());
        System.out.println("Perimeter : " + r.perimeter());
        System.out.println("Is it a sqaure : " + r.isSquare());
    }
}
