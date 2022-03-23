package miuExamSolution;

import java.util.Scanner;

public class RepsEqual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the enter number");
        int integer = input.nextInt();
        System.out.print("Enter an array length : ");
        int len = input.nextInt();
        int[] sampleData = new int[len];
        for (int index = 0; index < sampleData.length; index++) {
            sampleData[index] = input.nextInt();

        }
        int result = repsEqual(sampleData, integer);

        if (result == 0) {
            System.out.println("The given inter number and array are not equal: " + result);
        } else {
            System.out.println("The given inter number and array are equal: " + result);
        }

    }

    public static int repsEqual(int[] a, int num) {
        int repsEqual = 0;
        for (int last_index = a.length - 1; last_index >= 0; last_index--) {
            int last_Digit = num % 10;
            num = num / 10;

            if (last_Digit == a[last_index]) {
                repsEqual = 1;
            } else {
                repsEqual = 0;
                break;
            }
        }
        return repsEqual;
    }
}
