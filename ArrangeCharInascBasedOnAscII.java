package hemanth;

public class ArrangeCharInascBasedOnAscII {

	public static void main(String[] args) {
		
		String str="java";
		
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
					
			}
		}
		String sorted = new String (ch);
		System.out.println(sorted);
	}

}
