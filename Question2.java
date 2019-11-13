import java.util.Random;
import java.util.Scanner;

class Message implements Runnable {
    public boolean flag = true; // Flag to end loop upon interrupt

    // stopThread method changes the value of flag to false
    public void stopThread() {
        flag = false;
    }

    public void run() {
        while (flag) {
            try {
                Thread.sleep(100); // sleep method pauses execution of thread for given miliseconds
                System.out.println("Hi");
            } catch (Exception e) {
            }
        }
    }
}

class Question2 {

    public static void main(String ar[]) {
        Message object = new Message();
        Thread messageObject = new Thread(object);
        messageObject.start();
        try {
            System.in.read(); // System.in.read() reads data from input stream
            object.stopThread();
            messageObject.interrupt();
        } catch (Exception e) {
        }
        System.out.println("Stopped!");
    }
}