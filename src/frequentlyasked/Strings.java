package frequentlyasked;

import javax.net.ssl.HandshakeCompletedEvent;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String Literals-- Stored in String Constant Pool
		String str1 = "Hello";
		String str3 = "Hello";
		String str5 = "Hello";
		
		//String Objects -- Stored in Heap
		String str2 = new String ("Welcome");// Object will store in Heap Storage memory
		String str4 = new String ("Welcome");
		
		
		System.out.println(str1);
		System.out.println("str2: "+str2);
		
//		if (str1 == str3 && str1.equals(str3)){
//			System.out.println("str1 and str3 is referneceing same object Hello using == conditional operators and equals method");
//		}
//		else{
//			System.out.println("str1 and str3 is not referneceing same objects");
//		}
		
		//The function checks the actual contents comparison of the string, the == operator checks whether the references to the objects are equal
		System.out.println("str1.equals(str3) is  " +str1.equals(str3)+" due to strings litrals stores in string constant pool");
		
		//== operator meant for reference or address comparison 
		System.out.println("str1==str3 is " +(str1==str3)+" due to the constant pool will not create same object again with reference str3");//true due to strings literals
		
		System.out.println("str2==str4 is "+(str2==str4)+" due to string object is stored in Heap memory."); //false due to Heap memory storage
		System.out.println("str2.equals(str4) is "+str2.equals(str4)+" due to string object is stored in Heap memory.");
//		System.out.println(MyUtilities.mimicObjectToString(str1));
//		System.out.println(Integer.toHexString(str2));
		System.out.println(str3);
		System.out.println(str4);
		
		// Object reference addresses 
		System.out.println("Ref of str1: " + Integer.toHexString(System.identityHashCode(str1)));
		System.out.println("Ref of str3: " + Integer.toHexString(System.identityHashCode(str3)));
		System.out.println("Ref of str5: " + Integer.toHexString(System.identityHashCode(str5)));
		System.out.println("Ref of str2: " + Integer.toHexString(System.identityHashCode(str2)));
		System.out.println("Ref of str4: " + Integer.toHexString(System.identityHashCode(str4)));
		
		
		//Hashcode
		
		System.out.println("Hashcode of str1: " + str1.hashCode());
		System.out.println("Hashcode of str3: " + str3.hashCode());
		System.out.println("Hashcode of str5: " + str5.hashCode());
		System.out.println("Hashcode of str2: " + str2.hashCode());
		System.out.println("Hashcode of str4: " + str4.hashCode());
		
		
		//charAt()
		
		char character = "Umesh".charAt(0); // str1.charAt(0);
		
		System.out.println("Umesh has '" + character + "' character at 0 position");
		
		
		//length()
		System.out.println("lenght of the str1 is : " + str1.length());
	
		//int indexOf(String sub)
		
		String question = "Who is John Galt?";
		
		System.out.println(question.indexOf("Galt")); 
		
		// Immutability
		System.out.println(Integer.toHexString(System.identityHashCode(str1)));
		str1 = str1 + " + Hi";
		
		System.out.println(str1);
		
		String str6 = str1.concat(str2);
		
		System.out.println("str1: " + str1);
		System.out.println("str6: " + str6);
		System.out.println(Integer.toHexString(System.identityHashCode(str1)));
		System.out.println(str1.hashCode());
		
		
		
		
	}

	

}
