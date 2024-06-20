package ArrayProgramming;

import java.util.*;

public class BinaryEquivalentForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
	
		for(int i = 0; i<a.length; i++) {
			a[i] = sc.nextInt();	
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(binary(a[i])+ " ");
		}
	}

	public static String binary(int n) {
		String binary= "";
		while(n!=0) {
			int remainder = n%2;
			binary = remainder+binary;
			n=n/2;
		}
		return binary;
	}
}
