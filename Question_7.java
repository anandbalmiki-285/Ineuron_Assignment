// WAP to find if String contains all unique characters.
public class Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println(hasUniqueCharacters("hello"));
		
	}
	private static boolean hasUniqueCharacters(String str){
	    for(char ch : str.toCharArray()){
	      if(str.indexOf(ch) == str.lastIndexOf(ch))
	        continue;
	      else
	        return false;
	    }
	    return true;
	  }

}
