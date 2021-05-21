package strings;
import java.util.Scanner;
public class pb4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int l=str.length();
		if(l%2==0) {
			System.out.println(str.substring(0,l/2));
		}
		else {
			System.out.println("nill");
		}

	}

}
