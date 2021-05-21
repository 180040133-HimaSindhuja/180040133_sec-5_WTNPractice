package arrayspractice;
import java.util.*;

public class problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
	    int temp = 0;    
	    System.out.println("Elements of original array: ");    
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		 for (int i = 0; i < a.length; i++) {     
	         for (int j = i+1; j < a.length; j++) {     
	            if(a[i] > a[j]) {    
	                temp = a[i];    
	                a[i] = a[j];    
	                a[j] = temp;    
	            }     
	         }     
	     }    
	       
	     System.out.println();    
	         
	     //Displaying elements of array after sorting    
	     System.out.println("Elements of array sorted in ascending order: ");    
	     for (int i = 0; i < a.length; i++) {     
	         System.out.print(a[i] + " ");    
	     }  
	     sc.close();
	}

}
