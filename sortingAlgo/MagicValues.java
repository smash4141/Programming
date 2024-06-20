package sortingAlgo;

import java.util.Arrays;

public class MagicValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {0,4,0,0,1,3,4,1,0,2};
//there are four methods to copy/duplicate the whole array
//1
int[] b = a.clone();
//2
int [] c=new int[a.length];
for(int i=0; i<a.length;i++) {
	c[i] = a[i];
}
//3
int[]d=Arrays.copyOf(a, a.length);
//4
//int[] e = system


int sumGood=0;
int sumBad=0;
System.out.println("Before sort");
magic(a);
for(int i=0; i<a.length;i++) {
	for(int j=0; j<a.length-1;j++) {
		if(a[j]>a[j+1]) {
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;		
		}
	}

	if(b[i]==a[i]) {
		sumGood=sumGood+a[i];
	}
	else {
		sumBad=sumBad+a[i];
	}
}

//for(int i=0; i<a.length;i++) {
//if(b[i]==a[i]) {
//	sumGood=sumGood+a[i];
//}
//else {
//	sumBad=sumBad+a[i];
//}
//}
System.out.println(sumGood);
System.out.println(sumBad);
int diff = sumGood-sumBad;
System.out.println(diff);

System.out.println("After sort");
magic(a);
	}

	public static void magic(int[] a) {
		
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
