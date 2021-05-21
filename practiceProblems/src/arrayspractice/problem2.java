package arrayspractice;
import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Maximum value in the array is:"+max(arr));
	    System.out.println("Minimum value in the array is:"+min(arr));
	    sc.close();
	}
	public static int max(int [] array) {
		int max = 0;
	    for(int i=0; i<array.length; i++ ) {
	    	if(array[i]>max) {
	            max = array[i];
	        }
	    }
	    return max;
	}
	public static int min(int [] array) {
	    int min = array[0];
	    for(int i=0; i<array.length; i++ ) {
	    	if(array[i]<min) {
	           min = array[i];
	        }
	    }
	    return min;

	}

}
