package Searching_Algorithm;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {9,5,13,1,3};
int search=9;
Arrays.sort(a);
int sp=0;  //starting point
int ep=a.length-1;  //ending point

while(sp<=ep) {
	int mid=(sp+ep)/2; //middle point
	if(search==a[mid]) {
		System.out.println("Elements is present at "+mid+" index");
		break;
	}
	
	else if(search>a[mid]) {
		sp=mid+1;
	}
	else if(search < a[mid]) {
		ep=mid-1;
	}
}

if(sp>ep) {
	System.out.println("Elements is not present");
}

	}

}
