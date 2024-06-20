package ArrayProgramming;
import java.util.*;

public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements you want to present in a array:");
int n = sc.nextInt();

	int [] a= new int[n];
	for(int i=0; i<a.length; i++) {
		a[i]=sc.nextInt();
	}
	
	int target=10;
	for(int i =0; i<a.length; i++) {
		for(int j=i+1; j<a.length; j++) {
			if(a[i]+a[j]==target) {
				System.out.print("Index for target are: "+i+"  "+j);
				
			}
		}
		
	}
	
	}

}
