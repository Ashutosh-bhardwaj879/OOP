// POLYMORPHISM USING METHOD OVERLOADING
package JAVA.POLYMORPHISM;

class Test {
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public float max(float a, float b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public float max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
}

public class overloading {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.max(1, 2));
        System.out.println(t.max(1.1f, 2.1f));
        System.out.println(t.max(4, 2, 3));
    }
}
