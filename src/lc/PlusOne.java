package lc;

public class PlusOne {

	public static void main(String[] args) {
		
/*
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, 
 * and each element in the array contain a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:
Input: [4,3,2,1]
* Output: [4,3,2,2]
* Explanation: The array represents the integer 4321.
*/
		int[] digits = {4,3,2,1};
		

}
	
	public int[] plusOne(int[] digits) {
		if (digits[digits.length-1] < 9) {
			digits[digits.length-1] = digits[digits.length-1]+1;
		}
//		String strNum = null;
//		for (int i =0; i < digits.length; i++) {
//			strNum = strNum + digits[0];
//		}
//		
//		int resultInt = Integer.parseInt(strNum) + 1;
		
		
		
		
		
		return digits;
	        
	    }

}
