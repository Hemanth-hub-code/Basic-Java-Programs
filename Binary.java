package hemanth;

public class Binary {
	
	public static int dectobin(int num,int i,int sum) {
		if(num==0)
			return sum;
		
		int digits=num%2;
		sum+=digits*i;
		return dectobin(num/2,i*10,sum);
		
	}

	public static void main(String[] args) {
		System.out.println(dectobin(25,1,0));
		

	}

}
