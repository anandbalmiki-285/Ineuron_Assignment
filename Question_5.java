import java.util.Arrays;
import java.util.Scanner;

//WAP to implement Anagram Checking least inbuilt methods being used.


public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter first String: ");
	    String str1 = sc.nextLine();
	    System.out.println("Enter first String: ");
	    String str2 = sc.nextLine();
	    
	    str1= str1.replace(" ", " ");
	    str2= str2.replace(" ", " ");
	    
	    str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();
	    
	    char a[] = str1.toCharArray();
	    char b[] =str2.toCharArray();
	    
	    Arrays.sort(a);
	    Arrays.sort(b);
	    
	    Boolean result = Arrays.equals(a, b);
	    
	    if(result == true)
	    {
	    	System.out.println("String are Anangram");
	    }
	    else {
	    	System.out.println("String are  not Anangram");	
	    }
	    

	}

}
