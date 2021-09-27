package JAVA.Threading;

class My implements Runnable {
    public void run() {
        int i = 1;
        while (i < 5) {
            System.out.println(i + "hello");
            i++;
        }
    }
}

class runnable1 {
    public static void main(String[] args) {
        My m = new My();
        Thread t = new Thread(m);
        t.start();
        int i = 1;
        while (i < 10) {
            System.out.println(i + "world");
            i++;
        }
    }
}
