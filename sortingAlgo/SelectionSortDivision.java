package sortingAlgo;
import java.util.*;
public class SelectionSortDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int [] a= new int[n];
for(int i=0; i<a.length; i++) {
	a[i]=sc.nextInt();
}
int k =sc.nextInt();

int sum=0;
int count=0;
for(int i=0; i<a.length; i++) {
	// int count=0;
	while(a[i]%k !=0) {
		a[i]--;
		count++;
	}
//	sum=sum+count;
}
// 5	5 9 12 16 25 	6 
System.out.println(count);
	
	}
}
