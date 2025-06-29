package practice_programs;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int sq=num*num;
		System.out.println("Square of a given number:" +sq);
		
		while(num>0) {
			if(num%10 != sq%10) {
				System.out.println(temp + " is not a automorphic");
				break;
			}
			num/=10;
			sq/=10;
			}
		System.out.println(temp + " is a automorphic ");
	}
}

