package practice_programs;

import java.util.Scanner;

public class CheckAlphabetNumberSpecialChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");
		char character = sc.next().charAt(0);
		
		if(character>='0' && character<='9')
		System.out.println("It is a number");
		else if(character>='A' && character<='Z')
			System.out.println("It is a Capital Letter");
		else if(character>='a' && character<='z')
			System.out.println("It is a Small Letter");
		else
			System.out.println("Special symbol");
		
	}

}
