package classandobjects;
import java.util.*;

class Box{
	int Volume(int x,int y,int z) {
		return x*y*z;
	}
}

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box bo=new Box();
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int b=s.nextInt();
		int h=s.nextInt();
		int v=bo.Volume(l,b,h);
		System.out.println(v);
		
		s.close();

	}

}