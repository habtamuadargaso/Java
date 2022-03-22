package miuExamSolution;


public class SumOfOddEven {
    public static void main (String[] args){
        int [] samplDataArry = {4,1,2,3};
        int result = Calculate(samplDataArry);
        System.out.println(" SumOfOddnNumbersNumbers-SumOfEvenNumbers = " + result);
        
    }
    static int Calculate(int[] givenarry){
        int SumOfEvenNumbers = 0;
        int SumOfOddnNumbers = 0 ;
        
        for (int i = 0;i < givenarry.length ;i++){
            if (givenarry[i] % 2 == 0){
                SumOfEvenNumbers = SumOfEvenNumbers + givenarry [i];
            } 
            else {
                SumOfOddnNumbers = SumOfOddnNumbers + givenarry[i];
            }
        }
        return (SumOfOddnNumbers - SumOfEvenNumbers);
    }
}