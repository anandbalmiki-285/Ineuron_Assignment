// WAP to check if “2552” is palindrome or not.

import java.util.*;
public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 2552, reverse_number = 0, rem;
	    int original_number = num;
	    while (num != 0) {
	      rem = num % 10;
	      reverse_number = reverse_number * 10 + rem;
	      num /= 10;
	    }
	    
	    // check if reversedNum and originalNum are equal
	    if (original_number == reverse_number) {
	      System.out.println(original_number + " is Palindrome Number.");
	    }
	    else {
	      System.out.println(original_number + " is not Palindrome Number.");
	    }
	    
	      

	}

}
