package miuExamSolution.proCupineNumber;

public class findPorcupineNumber_{
	public static void main(String[] args){
		int result = findPorcupineNumber(138);
		System.out.println(result); 
		result = findPorcupineNumber(138);
		System.out.println(result);
		result = findPorcupineNumber(139);
		System.out.println(result);
	}
/*finding fun*/
	static int findPorcupineNumber(int n){
		/*let assign the variable that holds porcupineNumber */
		int porcupineNumber = 0;
		/*assign the maxvalue  which integer.Max_Value*/
		int maxValue = Integer.MAX_VALUE;
		boolean isPorcupineNumber = false;
		/* we are looking the next integer which greater than n so we consider n++*/
		n++;

		while(n <= maxValue){
			if(isPorcupineNumber){
				if(isPrime(n) == 1){
					if(n % 10 == 9){
						break;
					}else{
						isPorcupineNumber = false;
					}
				}
			}else{
				if(isPrime(n) == 1){
					if(n % 10 == 9){
						isPorcupineNumber = true;
						porcupineNumber = n;	
					}
				}
			}
			n++;
		}
		return porcupineNumber;
	}

	static int isPrime(int number){
		int isPrime = 0;
		if(number > 1){
			isPrime = 1;
			for(int divider = 2; 2*divider <= number; divider++){
				if(number % divider == 0){
					isPrime = 0;
					break;
				}
			}
		}
		return isPrime;
	}
}