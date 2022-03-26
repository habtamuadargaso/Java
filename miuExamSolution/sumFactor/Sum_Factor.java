package miuExamSolution.sumFactor;

import java.util.*;

public class Sum_Factor {
    public static void main(String[] args) {
     /* we need the input variable number for array */
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter array length: ");
        /* eneter array length */
        int length_ = input.nextInt();
        /* assign array length for the given array [length] */
        int []testAarray = new int[length_];
        /* using for loop to assign the array element */
        for(int i = 0 ; i < testAarray.length ; i++){
            testAarray[i] = input.nextInt();
        }
        /* pass array element to method by using calling methods */
        int result = sumFactor(testAarray);
        /* then print out the result */
        if (result ==0 ){
            System.out.println("The array is not sum of factor :" + result) ;
        }
        else{
            System.out.println("The array sum of factror is :" + result) ;

        }


    }
    /*
     * write a methods that sum given array list element and find sum number in
     * array list
     */

    public static int sumFactor(int[] a) {
        /* let assign variable sumFactor = 0 to count sum; */
        int sumFactor = 0;
        int sum = 0;

        /* using for loop eneter to read the given array to sum */
        for (int indext = 0; indext < a.length; indext++) {
            sum += a[indext];

        }
        /*
         * check the sum how many time appear in the array .to check this used for loop
         */

        for (int i = 0; i < a.length; i++) {
            /*
             * if the given array is elemes is equal to sum then count up ++ then add
             * contious checking
             */
            if (a[i] == sum) {
                sum += a[i];
                sumFactor++;
            }

        }
        return sumFactor;
    }

}