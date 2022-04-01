package guthrie_index;


public class Guthrie_index{

    public static void main (String[] args){
     int result = guthrieindex(1);
     System.out.println(result);
     System.out.println(result);
     result = guthrieindex(3);
     System.out.println(result);
     result = guthrieindex(4);
     System.out.println(result);
     result = guthrieindex(42);
     System.out.println(result);

    }
   static int guthrieindex(int n){
       int guthrieindex_num = 0 ;
       if(n > 0){
           while(n !=1){
               if(n %2 ==0){
                   n=n/2;
               }
               else{
                   n = n * 3 + 1  ;
               }
               guthrieindex_num ++;
           }
          
       }
       return guthrieindex_num;
   }
}