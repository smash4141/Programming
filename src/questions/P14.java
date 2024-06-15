package questions;

import java.util.Scanner;

public class P14 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// WAJP to find even and odd sum of the digits.
		int n = scan.nextInt();
		int oddSum = 0;
		int evenSum = 0;
		
		while(n!=0) {
			int digit = n % 10;
			if(digit % 2 == 0)
			{
				evenSum = evenSum +digit;
			}else {
				oddSum = oddSum + digit;
			}
			n = n/10;
		}
		int product = oddSum * evenSum;
		System.out.println(product);
	}
}
