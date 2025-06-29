package practice_programs;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		sc.close();
		int sum=0;
		int i;
		
		while (num>0) {
			
		    sum+=num%10;
		    num/=10;
			}
		System.out.println(sum);
       
	}
    
}
