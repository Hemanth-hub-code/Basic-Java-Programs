package practice_programs;

public class Duplicate_elements {
	
	public static void main(String[] args) {
		
		boolean flag =false;
		
		String arr[]= {"hemanth","deepak","ashok","hemanth","deepak"};
		
		for(int j=0;j<=arr.length-1;j++) {
			for(int i=j+1;i<=arr.length-1;i++)
			{
				if(arr[j]==arr[i]) {
					System.out.println("Duplicate Elements Found :" +arr[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false) {
			System.out.println("elements not found");
		}
		
		
	}

}
