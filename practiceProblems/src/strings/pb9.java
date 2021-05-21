package strings;

import java.util.Scanner;

public class pb9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String n1=s.nextLine();
		String n2=s.nextLine();
		int l1=n1.length();
		int l2=n2.length();
		String res="";
		if(l1>l2) 
		{
			for(int i=0;i<l2;i++)
			{
				res=res+n1.charAt(i)+n2.charAt(i);
				
				}
			for(int i=l2;i<l1;i++) {
				res=res+n1.charAt(i);
			}
		}
		else {

			for(int i=0;i<l1;i++)
			{
				res=res+n1.charAt(i)+n2.charAt(i);
				
				}
			for(int i=l1;i<l2;i++) {
				res=res+n2.charAt(i);
			}
		}
		System.out.println(res);
		
		s.close();
	}

}
