//ALL ABSTRACT METHODS in ABSTRACT CLASS AND ALL METHODS ARE OVERRIDDEN IN SUB CLASS
package JAVA.ABSTRACT;

abstract class Super {
    abstract void method1();

    abstract void method2();
}

class Sub extends Super {
    @Override
    void method1() {
        System.out.println("SUB METHOD 1 ");
    }

    @Override
    void method2() {
        System.out.println("SUB METHOD 1 ");
    }
}

public class ex1 {
    public static void main(String[] args) {
        Super s = new Sub();
        s.method1();
        s.method2();
    }
}