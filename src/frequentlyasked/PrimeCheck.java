package frequentlyasked;

public class PrimeCheck {
	
	public static void main (String[] arg){
		
		PrimeCheck primechk = new PrimeCheck();
		
		int n = 13;
		System.out.println("The Number " + n + " is prime number: " + primechk.isPrime(n));		
	}

	
	 public boolean isPrime(int n){
		 for(int i = 2; i < n; i ++){
			 if(n%i == 0){
				 return false;
			 }
		 }
		return true;
	 }
}
