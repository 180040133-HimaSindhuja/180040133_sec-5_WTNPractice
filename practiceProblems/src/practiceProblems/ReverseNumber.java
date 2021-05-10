package practiceProblems;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		int ip = sc.nextInt(); // 1234
		int op = 0; // 4321
		int i = (int) Math.pow(10, String.valueOf(ip).length() - 1);
		
		while (ip != 0) {
			int digit = ip % 10;
			op += digit * i;
			i /= 10;
			ip /= 10;
		}
		
		System.out.println(op);
		
		sc.close();

	}

}
