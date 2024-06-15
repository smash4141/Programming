package questions;

import java.util.Scanner;

public class P11 {
	
	public static void main(String[] args) {
		// Q. 1) WAJP to calculate the GCD of two numbers
		
		Scanner scan = new Scanner(System.in);
		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		int gcd = 1;
//		
//		for(int i = 1; i <= a; i++)
//		{
//			if(a%i==0 && b%i==0)
//			{
//				gcd = i;
//			}
//		}
//		System.out.println(gcd);
		
		// Q. 2) WAJP to calculate the LCM of numbers.
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int gcd = 1;
		for(int i = 1; i<=a; i++)
		{
			if(a%i == 0 && b%i == 0)
			{
				gcd = i;
			}
		}
		int lcm = (a*b)/gcd;
		System.out.println(lcm);
		
	}

}
