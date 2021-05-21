package strings;

import java.util.Scanner;

public class pb10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String n1=s.nextLine();
		int n=s.nextInt();
		int l1=n1.length();
		String res="";
		for(int i=0;i<n;i++) {
			res=res+n1.substring(l1-3,l1);
		}
		System.out.println(res);
		s.close();
	}

}
