package frequentlyasked;

public class PrimeCheck {
	
	public static void main (String[] arg){
		
		PrimeCheck primechk = new PrimeCheck(); // Becoz isPrime check is not static so creating instance first.
		
		int n = 13;
		System.out.println("The Number " + n + " is prime number: " + primechk.isPrime(n));		
	}

	
	 public boolean isPrime(int n){
		 if (n < 2) return false; // 0 and 1 are not prime, but 2 is prime 
		 
		 for(int i = 2; i < n; i ++){
			 if(n%i == 0){
				 return false;
			 }
		 }
		return true;
	 }
}
	