package strings;

import java.util.Scanner;

public class pb3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String n1=s.nextLine();
		int l1=n1.length();
		String res="";
		for(int i=0;i<l1;i++) {
			res=res+n1.substring(0,2);
			
		}
		System.out.println(res);
		s.close();
	}
}
