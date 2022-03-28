package miuExamSolution.base_of_10;


public class countSquarePair{
	public static void main(String[] args){
		int result = countSquarePairs(new int[]{11, 5, 4, 20});
		System.out.println(result);
		result = countSquarePairs(new int[]{9, 0, 2, -5, 7});
		System.out.println(result);
		result = countSquarePairs(new int[]{9});
		System.out.println(result);
	}
/* java funcation which count countSquarePairs */
	static int countSquarePairs(int[] a){
		/* assign variable hold one element at time*/
		int countSquarePairs = 0;
		/*Read the array by using the for loop each element and second array for compareitems each items  */
		for(int targetIndex = 0; targetIndex < a.length; targetIndex++){
			/* second compartion index */
			for(int compareIndex = 0; compareIndex < a.length; compareIndex++){
				/*check the condtion that both square are greater than > 0 for example are not<-5,9> <0,9>*/
				/* x and y are positive , non zero integers number  */
				if(a[targetIndex] > 0 && a[compareIndex] > 0){
					/*check the number x<y */
					if(a[targetIndex] < a[compareIndex]){
						/*check the condition that x+y is perfect square*/
						if(isPerfectSquare(a[targetIndex] + a[compareIndex]) == 1){
							countSquarePairs ++;
						}
					}
				}
			}
		}
		return countSquarePairs;
	}

/*funcation that check x+y is perefect square  */
static int isPerfectSquare(int element){
		/*asign variable that count perfect square  */
		int isPerfectSquare = 0;
		/*(x+y>0)*/
		if(element >= 0){
			/* check the perefect square*/
			double sqrtResult = Math.sqrt(element);
			/*convert double to integer*/
			int base = (int) sqrtResult;
			if((sqrtResult - base) == 0){
				isPerfectSquare = 1;
			}else{
				isPerfectSquare = 0;
			}
		}
		/* then return either one or two */
		return isPerfectSquare;
	}
}