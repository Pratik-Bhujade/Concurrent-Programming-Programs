import java.util.Random;
import java.util.Scanner;

class Die implements Runnable {
    int numberOfThrows; // Number of times die is thrown
    public int dieThrowArray[]; // This array stores the value of each throw

    Die(int numberOfThrows) {
        this.numberOfThrows = numberOfThrows;
        this.dieThrowArray = new int[numberOfThrows];
    }

    // This method returns the dieThrowArray
    public int[] returnArray() {
        return this.dieThrowArray;
    }

    public void run() {
        int i = 0;
        while (i < this.numberOfThrows) {
            try {
                dieThrowArray[i] = (int) (1 + (Math.random() * 6));
            } catch (Exception e) {
            }
            i++;
        }
    }
}

class Question3 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); // Scanner is used for input
        System.out.print("Enter number of throws-");
        int runs = scanner.nextInt(); // This variable stores the number of times a die is thrown
        int dieThrow[][] = new int[2][runs]; // This array stores the records of both the dice
        int count[] = { 0, 0, 0, 0, 0, 0 }; // This array stores the count of each number
        Die t1 = new Die(runs);
        Die t2 = new Die(runs);
        Thread obj1 = new Thread(t1);
        Thread obj2 = new Thread(t2);
        obj1.start();
        obj2.start();
        try {
            obj1.join();
            obj2.join();
        } catch (Exception e) {
        }

        dieThrow[0] = t1.returnArray();
        dieThrow[1] = t2.returnArray();
        int i = 0;

        // This loop counts the occurance of each number
        while (i < runs) {
            if (dieThrow[0][i] > 0 && dieThrow[0][i] < 7) {
                count[dieThrow[0][i] - 1]++;
            }
            if (dieThrow[1][i] > 0 && dieThrow[1][i] < 7) {
                count[dieThrow[1][i] - 1]++;
            }
            System.out.println(dieThrow[0][i] + " " + dieThrow[1][i]);
            i++;
        }
        for (int j = 0; j < count.length; j++) {
            System.out.println("Number of " + (j + 1) + " - " + count[j]);
        }
        System.out.println("Stopped!");
    }
}