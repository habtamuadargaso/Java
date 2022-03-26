package miuExamSolution.isDivisible;

import java.util.*;

public class isDivisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int arrayLength = input.nextInt();
        int[] sampledData = new int[arrayLength];
        for (int i = 0; i < sampledData.length; i++) {
            sampledData[i] = input.nextInt();
        }
        System.out.println("Enter divisor Number : ");

        int divisor = input.nextInt();
        int result = isDivisible(sampledData, divisor);
        System.out.println(result);

    }

    static int isDivisible(int[] a, int divisor) {
        for (int indext = 0; indext < a.length; indext++) {
            if (a[indext] % divisor != 0) {
                return 0;
            }
        }
        return 1;
    }
}
