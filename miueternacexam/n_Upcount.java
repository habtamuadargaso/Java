package miueternacexam;

import java.util.*;

public class n_Upcount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length : ");
        int len = input.nextInt();
        int[] SampleData = new int[len];
        for (int i = 0; i < SampleData.length; i++) {
            SampleData[i] = input.nextInt();
        }
        System.out.print("Enter number_Upcount");
        int Number = input.nextInt();
        int result = Upcount(SampleData, Number);

        System.out.print("Upcount IS:" + result);
        System.out.println();

    }

    static int Upcount(int a[], int n) {
        int partialSum = 0;
        int perviousSum = 0;
        int Upcount = 0;

        for (int i = 0; i < a.length; i++) {
            perviousSum = partialSum;
            partialSum = partialSum + a[i];
            if (perviousSum <= n && partialSum > n) {
                Upcount++;
            }
        }
        return Upcount;
    }
}
