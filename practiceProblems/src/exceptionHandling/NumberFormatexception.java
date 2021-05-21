package exceptionHandling;

import java.util.Scanner;

public class NumberFormatexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		s.close();
		try {
			int n=Integer.parseInt(str);
			System.out.println(n*n);
			System.out.println("The work has been done successfully");
		}
		catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer.");
		}

	}
}
