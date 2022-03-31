package isNUnique.isNUnique;

import java.util.Scanner;

public class isNUnique_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a  lenth of array");
        int lengthArray = input.nextInt();
        int sampledData[] = new int[lengthArray];
        for (int i = 0; i < sampledData.length; i++) {
            System.out.println("Enter a " + i + "element of array:");
            sampledData[i] = input.nextInt();
        }
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        int result = isNUnique(sampledData, number);
        System.out.println("The result is : " + result);

    }

    /* funcation is callled isNUnique */
    public static int isNUnique(int[] a, int n) {
        /* let assign the variable isNuniue count for counting the given numbers */
        int isNUnique = 0;
        /*
         * we are looking for aleast two elements in the array to run this funcation the
         * funcation
         */
        if (a.length > 2) {
            /* let read the given array first holds the number */
            for (int indext = 0; indext < a.length; indext++) {
                /* let holds the second number from array */
                for (int innerIndex = indext + 1; innerIndex < a.length; innerIndex++) {
                    /* sum the two array element i and i+1 and if result is equal to given number */

                    if (a[indext] + a[innerIndex] == n) {
                        /*
                         * if two pair array are equal then we count the how many times appers in the
                         * array
                         */

                        if (isNUnique == 0) {

                            isNUnique = 1;

                        }
                        /* if is the number appers more than two break out from inner inner loop */
                        else {
                            isNUnique = 2;
                            break;
                        }

                    }

                }
                if (isNUnique == 2) {
                    isNUnique = 0;
                    break;
                }
            }

        }
        return isNUnique;
    }
}
