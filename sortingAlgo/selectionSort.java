package sortingAlgo;

import java.util.*;

public class selectionSort {

	
	//sorting in ascending
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[] = new int[n];

for(int i=0; i<a.length; i++) {
	a[i]=sc.nextInt();
}
printArray(a);
for(int i=0; i<a.length; i++) {
	int min=i;
	 for(int j=i+1; j<a.length; j++) {
		 if(a[j]<a[min]) // checking value which is smaller
		 {
min=j;			//assigned lowest index 
		 }
	 }
	 int temp=a[i];
	 a[i]=a[min];
	 a[min]=temp;
}
printArray(a);
	}
	public static void printArray(int[]a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}

}
