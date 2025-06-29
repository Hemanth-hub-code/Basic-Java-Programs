package practice_programs;

import java.util.Scanner;

public class BiggestOfTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value:");
		int a=sc.nextInt();
		System.out.println("Enter the b value:");
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a + " is  bigger value");
		}
		else
		{
			System.out.println(b + " is  bigger value ");
		}
	}

}
