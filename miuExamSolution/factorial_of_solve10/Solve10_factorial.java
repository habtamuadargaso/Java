package miuExamSolution.factorial_of_solve10;

public class Solve10_factorial {
    public static void main(String []args){

        int[] reslut = Solve10();
        if(reslut[0] == 0 && reslut[1] ==0){
            System.out.println("The true value element factorial is not equal to ten factorial");

        }
        else{
            System.out.println("The two array element factorial is not equal to ten factorial");
            System.out.println("The element of arrays are: " + reslut[0]+ " and " + reslut[1]);
        }

    }
    /* funcation type array data type declar */
    /* we dont need any parameter*/
    public static int [] Solve10() {
      /*we need the variable array that hold x,y */
        int [] Solve10 = new int[2]; 

        /* we need the variable for to hold 10 factorials and variable x , y factorials*/

        int tenfactorial = 1;
        int x =0 ;
        int y = 0 ;
        /* boolen is used for used if x factorial + y factorials =10  is thisrue and 
        boolen = true ..break out from loop*/ 
        boolean factorFound =false;
        /* let find the 10 factorial using for loop*/

        for(int i = 1 ; i < 10 ; i++){
            /* tenfactorial = 10*1*2*3........*9*/
            tenfactorial = tenfactorial * i;

        }
        /* find x factorial + y factorial  
        let start x from 1 */
        for(x = 1 ; x < 10;x++){
            /* let declar one variable for xfactorial to hold x factorial*/
            int xFactorial = 1;
            /* apply for loop to find xfactorial */
                for(int i = 1; i<=x; x++){
                    xFactorial = xFactorial * i ;
                }
                /* factorial loop for y number */
                for(y=1; y<10;y++){
                    int yfactorial = 1;
                    for(int j =1 ;j<10; j++){
                        yfactorial =yfactorial*j ;
                    }
                    /* if x!+y! =10! check the condition the factorial then
                    if the condtion true break out from y loop go to the x loop */
                    if(xFactorial + yfactorial == tenfactorial) {
                        factorFound = true;
                        break;
                    }
                }


                if(factorFound==true){
                    break;
                }
                if(x==10 && y == 10){
                    x = 0;
                    y = 0; 

                } 
                Solve10[0]= x;
                Solve10[1]=y;
                return Solve10;
        }
        return Solve10;



    }   

}
