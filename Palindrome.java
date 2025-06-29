package practice_programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number");
		int num=sc.nextInt();
		
		int orignum=num;
		int result=0;
		
		while(orignum>0) {
			int digits=orignum%10;
			result=(result*10)+digits;
			orignum/=10;
		}
		if(result==num) {
			System.out.println(num + " is a palindrome");
		}
		else
			System.out.println(num + " is not a palindrome");
	}

}
