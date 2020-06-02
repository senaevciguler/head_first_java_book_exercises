package chapter2.compiler;

public class TapeDeck {
        boolean canRecord = false;
        boolean canPlay = false;

        void playTape() {
            System.out.println("tape playing");
        }
        void recordTape() {
            System.out.println("tape recording");
        }
    }
    class TapeDeckTestDrive {
        public static void main(String [] args) {
            TapeDeck t = new TapeDeck();
            t.canRecord = true;
            t.canPlay = true;
            if (t.canRecord = true) {
                t.recordTape();
            }
            if (t.canPlay = true) {
                t.playTape();
            }
        }
    }

