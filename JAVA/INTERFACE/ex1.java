package JAVA.INTERFACE;

class Phone {
    void call() {
        System.out.println("PHONE CALLING");
    }

    void sms() {
        System.out.println("PHONE SMS RECEIVED");
    }
}

interface ImusicPlayer {
    void startMusic();

    void stopMusic();
}

interface Icamera {
    void click();

    void capture();
}

class smartPhone extends Phone implements ImusicPlayer, Icamera {
    @Override
    public void startMusic() {
        System.out.println("INTERFACE MUSIC STARTED");
    }

    @Override
    public void stopMusic() {
        System.out.println("INTERFACE MUSIC STOPPED");
    }

    @Override
    public void click() {
        System.out.println("INTERFACE CAMERA CLICKED ");
    }

    @Override
    public void capture() {
        System.out.println("INTERFACE CAMERA CAPTURED ");
    }

    public void videoSMS() {
        System.out.println("VIDEO SMS NON OVERRIDDEN");
    }

    public void videoCall() {
        System.out.println("VIDEO CALL NON OVERRIDDEN");
    }
}

public class ex1 {
    public static void main(String[] args) {
        smartPhone s = new smartPhone();
        // methods of class phone
        s.call();
        s.sms();
        // methods of interface icamera
        s.capture();
        s.click();
        // methods of interface imusic player
        s.startMusic();
        s.stopMusic();
        // own class methods
        s.videoCall();
        s.videoSMS();
        // phone object
        Phone p = new Phone();
        p.call();
        p.sms();
        System.out.println();
        // interface reference smartphone object
        ImusicPlayer m = new smartPhone();
        m.startMusic();
        m.stopMusic();
        System.out.println();
        // interface reference smartphone object
        Icamera c = new smartPhone();
        c.capture();
        c.click();
        System.out.println();
    }
}
