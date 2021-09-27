package JAVA.Threading;


class myThread extends Thread {
    public void run() {
        int i = 1;
        while (i < 20) {
            System.out.println(i + "hello");
            i++;
        }
    }
}

class threadClass {
    public static void main(String[] args) {
        myThread t = new myThread();
        t.start();
        int i = 1;
        while (i < 20) {
            System.out.println(i + "world");
            i++;
        }

    }
}
