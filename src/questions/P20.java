package questions;

import java.util.Scanner;

public class P20 {

	public static void main(String[] args) {
		// WAJP to calculate the result for number raised to power
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scan.nextInt();
		
		System.out.println("Enter the power: ");
		int power = scan.nextInt();
		
		int res = 1;
		for(int i = 1; i<=power; i++)
		{
			res = res * number;
		}
		System.out.println("Result: "+res);
	}
}
