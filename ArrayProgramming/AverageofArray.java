package ArrayProgramming;
import java.util.*;
public class AverageofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
//		int n = sc.nextInt();
//		int[] a=new int[n];
//		
//		for(int i = 0; i<a.length; i++) {
//			System.out.println("Enter the elements of array:"+i);
//			a[i]=sc.nextInt();
//		}
		
		int a[]= {12,0,14,3,5};
		float sum = 0;
		float count=0;
		for(int i = 0; i<a.length; i++) {
			sum = sum+a[i];
			count++;
		}
		System.out.println("Average of array: "+sum/count);
	}

}
