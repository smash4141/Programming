package ArrayProgramming;
import java.util.*;
public class userinput4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Size of an Array");
int n = sc.nextInt();

//size of array 'n' is decided over here
int[] a =new int[n];

//values are enter one-by-one
for(int i=0;i<a.length;i++) {
	System.out.println("Enter the elements: " + i);
	a[i] = sc.nextInt();
}

for(int i=0;i<a.length;i++) {
	System.out.println(	a[i] );
}

	}

}
