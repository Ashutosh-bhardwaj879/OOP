package JAVA.Inheritance;


//constructor in inheritance in java
class Parent {
    Parent(){
        System.out.println("Parent constructor");
    }
}
class Child extends Parent {
    Child(){
        System.out.println("Child constructor");
    }
}
class GrandChild extends Child {
    GrandChild(){
        System.out.println("GrandChild constructor");
    }
}
public class constInher {
    public static void main(String[] args) {
        GrandChild g = new GrandChild();
        System.out.println(g.getClass());     
    }
}
