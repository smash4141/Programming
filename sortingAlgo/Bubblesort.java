package sortingAlgo;
import java.util.*;
public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
//int n = sc.nextInt();
int[]a= {7,15,4,8,9};
//int [] a = new int[n];
//for(int i = 0; i<a.length;i++) {
//	a[i]= sc.nextInt();
//}

System.out.print("Before Sorting : ");
printArray(a);

//bubble sort logic
for(int i=0;i<a.length;i++) {
	for(int j=0; j<a.length-1;j++) {
		if(a[j]>a[j+1]) {
			//swaping elements using third variable temp
//			int temp=a[j];
//			a[j]= a[j+1];
//			a[j+1]=temp;
			
			//without third variable
			//a[j]=5 a[j+1]=10
			a[j]=a[j]+a[j+1]; //15
			a[j+1]=a[j]-a[j+1]; //5
			a[j]=a[j]-a[j+1];
		}
	}
}
System.out.print("After Sorting : ");
printArray(a);
	}

	
	public static void printArray(int[]a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
