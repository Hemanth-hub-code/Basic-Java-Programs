package practice_programs;

import java.util.Scanner;

public class CharacterVowelOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a letter:");
	   char letter =sc.next().charAt(0);
	   
	   if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
	   {
		   System.out.println(letter +" is vowel");
	   }
		   else
		   {
			   System.out.println(letter + " is not a vowel"); 
		   }
		 }
	  }


