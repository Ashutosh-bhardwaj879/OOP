package JAVA.Inheritance;

class Super1 {
    public void meth0() {
        System.out.println("Super meth0");
    }
    public void meth1() {
        System.out.println("Super method1");
    }

    public void meth2() {
        System.out.println("Super method2");
    }

    public void meth3() {
        System.out.println("Super method2");
    }
}

class Sub1 extends Super1 {
    @Override
    public void meth1() {
        System.out.println("Sub meth1");
    }

    @Override
    public void meth2() {
        System.out.println("Sub meth2");
    }

    @Override
    public void meth3() {
        System.out.println("Sub meth3");
    }

    public void meth4() {
        System.out.println("Sub meth4");
    }
}

public class dynamicMethod {
    public static void main(String[] args) {
        Super1 s1 = new Super1();
        s1.meth1();
        s1.meth2();
        s1.meth3();
        Sub1 s2 = new Sub1();
        s2.meth1();
        s2.meth2();
        s2.meth3();
        s2.meth4();
        Super1 s3 = new Sub1();
        s3.meth0();
        s3.meth1();
        s3.meth2();
        s3.meth3();
    }
}
