package JAVA.Threading;

class threadClass2 extends Thread {

    public void run() {
        int i = 1;
        while (i < 5) {
            System.out.println(i + "hello");
            i++;
        }
    }

    public static void main(String[] args) {
        threadClass2 t = new threadClass2();
        t.start();
        int i = 1;
        while (i < 6) {
            System.out.println(i + "world");
            i++;
        }
    }

}
