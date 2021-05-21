package strings;
import java.util.*;
public class pb5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        String na=s.nextLine();
        int l=na.length();
        for(int i=1;i<l-1;i++) {
        	System.out.print(na.charAt(i));
        }
	}

}
