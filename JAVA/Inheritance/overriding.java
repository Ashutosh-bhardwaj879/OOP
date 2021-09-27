package JAVA.Inheritance;

// method overriding + dynamic method dispatch
class Super {
    public void display() {
        System.out.println("DISPLAY SUPER");
    }
}

class Sub extends Super {
    @Override
    public void display() {
        System.out.println("DISPLAY SUB");
    }
}

public class overriding {
    public static void main(String[] args) {
        Super s = new Super();
        s.display();
        Sub s1 = new Sub();
        s1.display();
        Super s3 = new Sub();
        s3.display();
    }
}
