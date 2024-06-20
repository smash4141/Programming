package ArrayProgramming;

import java.util.*;

public class userinputoddproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.println("Enter the size of an Array");
int n =  sc.nextInt();

//fixing size of array
int a[] = new int[n];

for(int i=0; i<a.length; i++) {
	
	a[i] = sc.nextInt();
}


int prod = 1;
for(int i = 0; i<a.length; i++) {
	if(a[i]%2 != 0) {
		prod = prod*a[i];	
	}
	
}
System.out.println(prod);
	}

}
