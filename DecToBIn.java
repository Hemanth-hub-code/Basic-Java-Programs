package practice_programs;

import java.util.Scanner;

public class DecToBIn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal number");
		int decimal=sc.nextInt();
		
		String binary="";
		
		while(decimal>0) {
			int digits=decimal%2;
			binary=binary+digits;
			
			decimal/=2;
			}
		System.out.println(binary);
	}

}
