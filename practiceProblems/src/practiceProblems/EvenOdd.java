package practiceProblems;
import java.util.Scanner;

class TypeOfNumber
{
	void display(int a) {
		if(a%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
}

public class EvenOdd{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        TypeOfNumber t=new TypeOfNumber();
        t.display(n);
        int b=s.nextInt();
        TypeOfNumber t1=new TypeOfNumber();
        t1.display(b);
        s.close();
	}

}
