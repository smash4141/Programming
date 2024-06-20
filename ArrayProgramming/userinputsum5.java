package ArrayProgramming;
import java.util.*;


public class userinputsum5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("ENter the size of an array");
int n = sc.nextInt();

//fixing size of array over here
int[] a= new int[n];

//entering elements in array of that size
for(int i=0; i<a.length; i++) {
	a[i] = sc.nextInt();
}

//sum of all the digit of an array
int sum = 0;
for(int i=0; i<a.length; i++) {
	sum = sum+a[i];
}
System.out.println(sum);
	}

}
