package frequentlyasked;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// How to print string = "Hello Java Program" as string ="olleH avaJ
		// margorP"?

		String input = "Hello Java Program";


		String output = reverseChar(input);
		System.out.println("reverseString output: "+ output);
		
		String output1 = reverseWord(input);
		System.out.println("reverseWord output: " + output1);

	}

	private static String reverseWord(String input) {
		// TODO Auto-generated method stub
		String reverseString = "";
		
		String[] words = input.split(" ");
		System.out.println("words array: " + Arrays.toString(words));
		
//		for (int i = 0; i < words.length; i++)
		for (String word : words)
		{
			//Taking each word and reversing it
//			String word = words[i];
			String reverseWord = "";
			
			
			for(int j = word.length()-1; j >= 0; j--)
			{
				reverseWord = reverseWord + word.charAt(j);
			}
			
			reverseString = reverseString + reverseWord + " ";
		}
		
		return reverseString;
	}

	private static String reverseChar(String input) {
		// TODO Auto-generated method stub
		String reverse2 = "";

		char[] CharArray = input.toCharArray();
		System.out.println(CharArray);

		for (char item : CharArray) {
			reverse2 = item + reverse2;
		}
		return reverse2;
	}

}
