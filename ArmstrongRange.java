package hemanth;

import java.util.Scanner;

public class ArmstrongRange {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int start=sc.nextInt();
		System.out.println("Enter ending value");
		int end=sc.nextInt();
		
		int armstrongcount=0;
		for(int i=start;i<=end;i++) {
			int count=0, num=i,temp=i,sum=0;
			
			while(temp>0) {
				count++;
				temp/=10;
			}
			temp=i;
			
			while(temp>0) {
				int digits=temp%10;
				sum+=Math.pow(digits, count);
				temp/=10;
			}
			if(sum==num) {
				if(armstrongcount%2==0)
				{
				System.out.print(i+",");
				}
				armstrongcount++;
			}
			
		}
		
		

	}

}
