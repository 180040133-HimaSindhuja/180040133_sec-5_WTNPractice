package classandobjects;
import java.util.*;

class Calculator{
	static double powerInt(int num1,int num2) {
		return Math.pow(num1,num2);
	}
	static double powerDouble(double num1,int num2){
		return Math.pow(num1,num2);
	}
}

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		double a=s.nextDouble();
		int b=s.nextInt();
		System.out.println(c.powerInt(x,y));
		System.out.println(c.powerDouble(a, b));
		
		s.close();
	}
	

}
