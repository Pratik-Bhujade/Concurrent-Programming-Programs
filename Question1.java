import java.util.Random;

class HeadTail extends Thread {
    int counter; // Loop counter
    int headCount; // Stores number of heads
    int tailsCount; // Stores number of tails

    HeadTail() {
        this.counter = 0;
        this.headCount = 0;
        this.tailsCount = 0;
    }

    public void run() {
        while (this.counter < 1000) {
            this.counter++;
            if ((int) (Math.random() * 2) == 0) {
                this.tailsCount++;
            } else {
                this.headCount++;
            }
        }
        System.out.println("Head count - " + this.headCount + "\nTail count - " + this.tailsCount);
    }
}

class Question1 extends Thread {

    public static void main(String ar[]) {
        Thread object = new Thread(new HeadTail());
        object.start();
    }
}