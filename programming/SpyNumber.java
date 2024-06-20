package programming;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		
		// Q. WAJP to check if the number is a Spy number.
		//    A number is said to be a Spy number if the sum of the digits of a number,
		//    is equal to the product ti the digits of the number.
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sum = 0;
		int product = 1;
		while(n!=0) {
			int digit  = n % 10;
			sum = sum + digit;
			product  = product * digit;
			n = n/10;
		}
		if (sum == product) {
			System.out.println("Spy number");
		}else {
			System.out.println("Not a spy number");
		}
	}
}
