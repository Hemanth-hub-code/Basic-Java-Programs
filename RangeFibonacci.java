package hemanth;

import java.util.Scanner;

public class RangeFibonacci {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting range");
		int start=sc.nextInt();
		System.out.println("Enter Ending range");
		int end=sc.nextInt();
		
		int first=0,second=1,third=0;
		
		System.out.println("The range between "+ start +" and "+ end);
		while(first<=end) {
			if(first>=start)
			   System.out.print(first+",");
		
				third=first+second;
				first=second;
				second=third;
			}
			
		

	}

}
