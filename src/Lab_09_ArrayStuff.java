import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("--- PART 1 ---");

        int[] dataPoints = new int[100];

        // TASK 2:
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // TASK 3:
        System.out.println("\nData Points:");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println("\n");

        // TASK 4:
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);


        // TASK 5:
        int userValue = SafeInput.getRangedInt(in, "Enter a value to search for", 1, 100);

        // TASK 6:
        int matchCount = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                matchCount++;
            }
        }
        System.out.println("The value " + userValue + " was found " + matchCount + " times in the array.");

        // TASK 7:
        int searchTarget = SafeInput.getRangedInt(in, "Enter another value to find its first position", 1, 100);
        boolean found = false;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchTarget) {
                System.out.println("The value " + searchTarget + " was found at array index " + i + ".");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The value " + searchTarget + " was not found in the array.");
        }

        // TASK 8:
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        System.out.println("\nThe minimum value found in the array is: " + min);
        System.out.println("The maximum value found in the array is: " + max);

        // TASK 9:
        System.out.println("\nAverage of dataPoints (using method) is: " + getAverage(dataPoints));

        in.close();
    }

    // TASK 9:
    public static double getAverage(int values[]) {
        int methodSum = 0;
        for (int i = 0; i < values.length; i++) {
            methodSum += values[i];
        }
        return (double) methodSum / values.length;
    }
}