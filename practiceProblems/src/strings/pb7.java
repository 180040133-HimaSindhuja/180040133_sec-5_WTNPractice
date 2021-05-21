package strings;

import java.util.*;
public class pb7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String n1=s.nextLine();
		int l=n1.length();
		
		if(n1.charAt(0)=='x' && n1.charAt(l-1)=='x') {
			System.out.print(n1.substring(1,l-1));
		}
		else {
			System.out.print(n1);
		}
		s.close();
	}

}
