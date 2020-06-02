package chapter2.compiler;

public class DVDPlayer {
    boolean canRecord = false;
    boolean canPlay = false;

    void playDVD(){
        System.out.println("dvd playing");
    }

    void recordDVD() {
        System.out.println("dvd recording");
    }
}
class DVDPlayerTestDrive {
    public static void main(String [] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.canPlay = true;

        if (d.canRecord = true) {
            d.recordDVD();
        }
        if (d.canPlay = true) {
            d.playDVD();
        }
    }
}

