package hemanth;

import java.util.Scanner;

public class RangeArmstrong {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting range :");
		int start=sc.nextInt();
		System.out.println("Enter ending range :");
		int end=sc.nextInt();
		
		System.out.println("The range between "+ start +" and "+ end);
		for(int i=start;i<=end;i++) {
		int num=i;
		int temp=i;
		int count=0,sum=0;
		while(temp>0) {
			count++;
			temp/=10;
		}
		temp=num;
		while(temp>0) {
			int digits=temp%10;
			sum+=Math.pow(digits, count);
			temp/=10;
		}
		if(sum==i)
			System.out.println(i);
		}
	}

}
