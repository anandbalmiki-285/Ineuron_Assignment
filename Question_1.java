// WAP to remove Duplicates from a String.(Take any String ex with duplicates character)

import java.util.*;
public class Question_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        s1.chars().distinct().forEach(temp->stringBuilder.append((char) temp));
        String duplicate = stringBuilder.toString();
        System.out.println(duplicate);

	}

}
