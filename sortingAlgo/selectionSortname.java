package sortingAlgo;

public class selectionSortname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
char[] a = {'a','k','a','s','h'};
printArray(a);
for(int i=0; i<a.length;i++) {
	int min=i;
	for(int j=i+1; j<a.length; j++) {
		if(a[j]>a[min]) {
			min=j;
		}
	}
	char temp=a[i];
	a[i]=a[min];
	a[min]=temp;
}
printArray(a);
	}

	public static void printArray(char[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("");
	}
}
