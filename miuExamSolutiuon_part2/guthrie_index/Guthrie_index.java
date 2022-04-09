package guthrie_index;


public class Guthrie_index{

    public static void main (String[] args){
     int result = guthrieindex(1);
     System.out.println(result);
     result = guthrieindex(3);
     System.out.println(result);
     result = guthrieindex(4);
     System.out.println(result);
     result = guthrieindex(42);
     System.out.println(result);

    }
   static int guthrieindex(int n){
       /*let asign the variable the count the guthrieindex_num=0*/
       int guthrieindex_num = 0 ;
       /*let check the number is postive or not because the question says that n > 0*/
       if(n > 0){
           /*we need while loop because we want to go until our number is get 1 */
           while(n !=1){
               /*if the number is even then divied the number by two  n = number/2 */
               if(n %2 ==0){
                   
                   n=n/2;
               }

               /*else  if the number is odd number = n *3 +1 */
               else{
                   n = n * 3 + 1  ;
               }
               /* then count the loop running */
               guthrieindex_num ++;
           }
          
       }
       return guthrieindex_num;
   }
}