package miuExamSolution.StatonMeasure;

import java.util.Scanner;

public class StatonMeasure {
     public static void main(String arr[]){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter  array length: ");

         int len = input.nextInt();
         int array[] = new int[len];

         for(int index = 0; index< array.length;index++){
            System.out.println("Enter a " +  index + "element of array: ");
            array[index] = input.nextInt();
            }
            int result = statonMeasure(array);
            if(result == 0 ){
                System.out.println("The array is not stanton measure because the result is: " + result);
            }
            else{
                System.out.println("The stanton of the array is: " + result);
            }

     }
     public static int statonMeasure(int [] a){
         /* the count 1s occurance in the array  */
        int statonMeasure = 0;
        /* take the variable numbers how many time statonMeasure is occur in the variable */
        int statonOcuurance = 0;
       /*count 1s in the given array by using the for loop*/
        for(int index = 0 ; index < a.length; index++){
            /* check using the for loops 1s  */
           if(a[index] == 1) {
               /*count the occurance*/
               statonOcuurance++;
           }
        }
        /*then check the statonOcurance in the given array list using for  loop */
        for(int index = 0; index<a.length;index++){
            if(a[index] == statonOcuurance ){
                statonMeasure++;
            }
        }
        return statonMeasure;
        
    }
}

