package JAVA.INNER_CLASSES;

class Outer {
    int x = 10;

    class Inner {
        int y = 20;

        public void innerDisplay() {
             System.out.println(x + " " + y);
        }
    }

    public void outerDisplay() {
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
        Outer o1 = new Outer();
        //o1.outerDisplay();
        System.out.println(o1.x);
    }
}

public class nestedInner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();
        Outer.Inner oi = new Outer().new Inner();
        System.out.println(oi.y);
        oi.innerDisplay();
    }
}
