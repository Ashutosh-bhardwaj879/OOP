package JAVA.Threading;

class runnable2 implements Runnable {

    public void run() {
        int i = 1;
        while (i < 5) {
            System.out.println(i + "hello");
            i++;
        }
    }

    public static void main(String[] args) {
        runnable2 r = new runnable2();
        Thread t = new Thread(r);
        t.start();
        int i = 1;
        while (i < 10) {
            System.out.println(i + "world");
            i++;
        }
    }
}
