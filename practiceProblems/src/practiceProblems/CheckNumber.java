package practiceProblems;
import java.util.Scanner;

class Number{
	void display(int a) {
		if(a>0) {
			System.out.println("Positive number");
		}
		else if (a<0){
			System.out.println("Negative number");
		}
		else {
			System.out.println("Zero");
		}
	}
}
public class CheckNumber {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		Number n=new Number();
		n.display(a);
		s.close();

	}


}
