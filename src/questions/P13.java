package questions;

import java.util.Scanner;

public class P13 {
	
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		// Assignment questions
		int n = scan.nextInt();
		
		int sum = 0;
		while(n != 0)
		{
			int digit = n % 10;
			if (digit % 2 != 0) {
				sum = sum + digit;
			}
			n = n/10;
		}
		System.out.println(sum);
	}
}
