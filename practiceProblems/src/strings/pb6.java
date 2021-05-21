package strings;
import java.util.*;
public class pb6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String n1=s.nextLine();
		String n2=s.nextLine();
		int l1=n1.length();
		int l2=n2.length();
		if(l1>l2) {
			System.out.println(n2+n1+n2);
		}
		else {
			System.out.println(n1+n2+n1);
		}

	}

}
