package practice_programs;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n =sc.nextInt();
		
		int sum=0;
		int temp=n;
		int count=0;
		
		while(temp>0) {
			count++;
			temp/=10;
		}
        temp=n;
        while(temp>0) {
        	int digits=temp%10;
        	sum+= Math.pow(digits, count);
        	temp/=10;
        }
        if(sum==n) {
        	System.out.println(n + " is an Armstrong number");
        }
        else {
        	System.out.println(n+" is not an Armstrong number");
        }
	}

}
