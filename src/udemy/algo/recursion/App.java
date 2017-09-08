package udemy.algo.recursion;

public class App {

	public static void main(String[] args) {
		int[] a = {4,48,4,28,34,76,9,3};
		System.out.println(recursiveLinearSearch(a, 0, 4));
		reduceByOne(5);
	}

	private static void reduceByOne(int n) {
		if(n>=0)
			reduceByOne(n-1);
		
		System.out.println("Completed call: " + n);
		/** OutPut---> 
		Completed call: -1
		Completed call: 0
		Completed call: 1
		Completed call: 2
		Completed call: 3
		Completed call: 4
		Completed call: 5
		...
		 */
	}
	
	public static int recursiveLinearSearch(int[] a, int i, int x){
		if(i> a.length-1){
			return -1;
		}else if(a[i] == x){
			return i;
		} else{
			System.out.println("index at: " + i);
			return recursiveLinearSearch(a, i+1, x);
		}
		
	}
	

}

