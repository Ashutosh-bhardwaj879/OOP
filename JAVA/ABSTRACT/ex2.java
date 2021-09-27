package JAVA.ABSTRACT;

/* WE CAN DEFINE ABSTRACT CLASS WITHOUT USING ABSTRACT METHOD BUT WE  CANNOT DEFINE ABSTRACT METHOD WITHOUT USING ABSTRACT CLASS ABSTRACT METHOD SHOULD BE OVERRIDDEN IN SUB CLASS AT NAY COST OTHER SUB CLASS IS ALSO ABSTRACT CLASS */
abstract class Super1 {
    Super1() {
        System.out.println("CONST OF SUPER ABSTRACT");
    }

    void meth1() {
        System.out.println("METH1 ABSTRACT SUPER");
    }

    abstract void meth2();
}

class Sub1 extends Super1 {
    Sub1() {
        System.out.println("SUB CLASS CONST ");
    }

    void meth1() {
        System.out.println("METH1 OVERRIDDEN SUB");
    }

    void meth2() {
        System.out.println("OVERRIDDEN ABSTRACT SUB");
    }
}

public class ex2 {
    public static void main(String[] args) {
        Super1 s = new Sub1();
        s.meth1();
        Sub1 s1 = new Sub1();
        s1.meth1();
    }
}
