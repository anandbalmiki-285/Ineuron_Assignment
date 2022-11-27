//WAP to count the number of consonants, vowels, special characters in a String.

import java.util.Scanner;
public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		int i, alphabet_char, digit_char, special_char;
		i = alphabet_char = digit_char = special_char = 0;
		char ch;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\n Enter Alpha Numeric Special String =  ");
	    str = sc.nextLine();
		
		while(i < str.length())
		{
			ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alphabet_char++;
			}
			else if(ch >= '0' && ch <= '9') {
				digit_char++;
			}
			else {
				special_char++;
			}
			i++;
		}		
		System.out.println("\nNumber of Alphabet Characters  =  " + alphabet_char);
		System.out.println("Number of Digit Characters     =  " + digit_char);
		System.out.println("Number of Special Characters   =  " + special_char);
	
	
	
	}

}
