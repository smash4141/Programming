package sortingAlgo;

public class InsertionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {9,5,13,1,3};

System.out.print("Before Swaping : ");
printArray(a);

for(int i=0;i<a.length;i++) {
	int temp=a[i];
	int j=i;

	while(j>0 && a[j-1]>temp) {
		a[j]=a[j-1];
		j--;
	}
	a[j]=temp;
}

System.out.print("After Swaping : ");
printArray(a);

	}

	public static void printArray(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
