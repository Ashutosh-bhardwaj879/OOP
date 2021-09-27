// POLYMORPHISM USING OVERRIDING
package JAVA.POLYMORPHISM;

class Parent {
    void display() {
        System.out.println("PARENT DISPLAY");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("CHILD DISPLAY");
    }
}

public class overriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
        Child c = new Child();
        c.display();

    }
}
