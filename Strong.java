package practice_programs;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int sum=0;
		int temp=num;
	
		
		while(temp>0) {
			int digits=temp%10;
			int fact=1;
			for(int i=1;i<=digits;i++) {
				fact=fact*i;
			}
			sum+=fact;
			temp/=10;
		}
		
		if(sum==num) {
			System.out.println(num + " is a strong number");
		}
		else {
			System.out.println(num + " is not a strong number");
		}
	}
}