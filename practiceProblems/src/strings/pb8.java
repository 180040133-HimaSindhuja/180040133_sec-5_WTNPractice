package strings;


import java.util.Scanner;

public class pb8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String n1=s.nextLine();
		int l=n1.length();
		for(int i=0;i<l;i++) {
			if(n1.charAt(i)=='*' ||n1.charAt(i+1)=='*') {
				i=i+1;
				
			}
			else {
				System.out.print(n1.charAt(i));
			}
		}
		s.close();

	}

}
