package questions;

import java.util.Scanner;

public class NeonNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// WAJP to check if the number is Neon Number.
		// A number 
		
		int n = scan.nextInt();
		int sum = 0;
		int sqr = n*n;
		
		while(sqr!=0) {
			int digit = sqr % 10;
			sum = sum + digit;
			sqr = sqr/10;
		}
		if (sum == n) {
			System.out.println("Neon Number");
		} else {
			System.out.println("Not a Neon number");
		}
	}
}
