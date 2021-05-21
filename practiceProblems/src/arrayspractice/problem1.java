package arrayspractice;
import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int sum=0,avg;
		for(int i=0;i<n;i++)
			sum=sum+arr[i];
		avg=sum/n;
		System.out.println("Sum is: "+sum+"\nAverage: "+avg);
		sc.close();

	}

}
