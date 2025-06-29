package practice_programs;

import java.util.Scanner;

public class PrimeNumber{
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num value");
		int num=sc.nextInt();
		
		if(num<=1) {
			System.out.println(num + " is not a prime number");
		}
		else {int i;
			for( i=2;i<=num/2;i++) {
				if(num%i==0) {
					System.out.println(num + " is not a prime number");
					break;
				}
			}
			if( i>num/2) {
			System.out.println(num +" is a prime number");	
			}
		}
	
		
	}
}

	
	
	
	
	
	
	