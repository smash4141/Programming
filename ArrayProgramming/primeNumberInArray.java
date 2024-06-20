package ArrayProgramming;

import java.util.Scanner;

public class primeNumberInArray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
int [] a= new int[n];
for(int i=0; i<a.length;i++) {
	a[i]=sc.nextInt();
}

for(int i=1; i<a.length; i++) {

if(isPrimeNo(a[i])) {
	
	System.out.print(a[i]+" ");
}
 }
	}
	
public static boolean isPrimeNo(int n) {
	int count=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			count++;
		}
	}
	return count == 2? true:false;
}


}
