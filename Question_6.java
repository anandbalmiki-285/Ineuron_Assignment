import java.util.Scanner;

// WAP to implement Pangram Checking with least inbuilt methods being used.


public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter  String: ");
	    String str = sc.nextLine();
	    str = str.replace(" ", " ");
	    char y[] = str.toCharArray();
	    int size = str.length();
	    int a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	    
	    int i=0;
	    while(i !=size)
	    {
	    	int index =y[i]-65;
	    	a[index]=1;
	    	++i;
	    	}
	    i=0;
	    while(i!=26)
	    {
	    	if(a[i]==1)
	    	{
	    		++i;
	    	}
	    	else {
	    		System.out.println("Non-Pangram");
	    		System.exit(0);
	    	}
	    }
System.out.println("Pangram");	    
	}

}
