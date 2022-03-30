package miuExamSolutiuon_part2.isNUnique;

public class isSquare{
    public static void main(String[] args){
        int result = isSquare(25);
        System.out.println("the return value " + result);
    }
    public static int isSquare(int n){
        
        for(int i = 0; i <= n ; i++){
            if(i*i == n){
                return 1;
            }
           
        }
        return 0 ;
    }
}