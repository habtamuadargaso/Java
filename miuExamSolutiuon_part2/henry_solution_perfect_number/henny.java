package henry_solution_perfect_number;

public class henny {
    public static void main(String[] args){
        
        int result = henry(1,3);
        System.out.println(result);

    }
    static int henry (int i , int j){
        int henry = 0 ; 
        int max = Integer.MAX_VALUE;
        int perfectCount = 0 ; 
        for(int number = 0 ; number<= max; number++){
            int sum = 0 ; 
            for(int divied = 1 ; divied < number; divied++){
                if(number % divied == 0) {
                    sum+=divied;
                }
            }
            if(sum == number ){
            perfectCount++;
            if(perfectCount ==1){
                henry += sum;
                break;
            }
            }
        }
       return henry;
    }
}
