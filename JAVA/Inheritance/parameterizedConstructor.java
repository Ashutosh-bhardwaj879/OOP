package JAVA.Inheritance;
// how to call parametrized of parent class
//we should use super()
class Parents {
    Parents() {
        System.out.println("Non Param of parent");
    }

    Parents(int x) {
        System.out.println("Param of parent " + x);
    }
}

class Childs extends Parents {
    Childs() {
        System.out.println("Non Param of child");
    }

    Childs(int y) {
        System.out.println("Parameterized of child");
    }

    Childs(int x, int y) {
        super(x);
        System.out.println("2 param of child " + y);
    }
}

public class parameterizedConstructor {
    public static void main(String[] args) {
        Childs c1 = new Childs();
        System.out.println();
        Childs c2 = new Childs(20);
        System.out.println();
        Childs c3 = new Childs(40,50);
        c1.getClass();
        c2.getClass();
        c3.getClass();
    }
}
