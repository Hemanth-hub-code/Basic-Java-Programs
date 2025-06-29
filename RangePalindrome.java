package hemanth;

import java.util.Scanner;

public class RangePalindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting range");
		int start=sc.nextInt();
		System.out.println("Enter Ending range");
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++) {
			int temp=i,num=i,rev=0;
			
			while(temp>0) {
				int digits=temp%10;
				rev=(rev*10)+digits;
				temp/=10;
			}
			if(rev==num)
				System.out.println(i);
		}
	}

}
