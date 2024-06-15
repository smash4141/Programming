package questions;

import java.util.Scanner;

public class P17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// WAJP to check if the number is palindrome number or not
		// Palindrome number means the number is equal to it's reverse number
		// First we have to reveres the number then compare the number with reverse number
		
		int n = scan.nextInt();
		int reverse = 0;
		int temp = n;
		while(n !=0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n/10;
		}
		if (reverse == temp) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not a Palindrome number");
		}
	}
}
