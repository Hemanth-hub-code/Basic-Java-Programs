package practice_programs;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter str value :");
		String str =sc.nextLine();
		 char result [] =  str.toCharArray();
		 
		 System.out.println(str.length());
		 
		 for(int i =str.length()-1;i>=0;i--) {
			 System.out.print(result[i]);
		 }
		sc.close();
	  }

}


