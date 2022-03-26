package miuExamSolution.reverseGivenInteger;


public class ReverseGivenInteger
{
    public static void main(String[] args) {
        int samplaData = 11235 ; 
        int result = reverseGivenInteger(samplaData);
        System.out.println(result);
    }
    static int reverseGivenInteger(int givenInteger){
        int sign = 1; 
        if (givenInteger == 0){
            return 0 ; 
            
        } 
        if(givenInteger < 0 ){
            sign = -1 ;
            givenInteger = (-1)* givenInteger ;
        }
        int reverse = 0;
        while(givenInteger != 0){
            reverse = (reverse*10) + (givenInteger%10);
            givenInteger = givenInteger/10;
        }
        return sign * reverse ;
    }
    
}
