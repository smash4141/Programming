package questions;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		// WAP to find all the factors of a number.
		
		Scanner scan = new Scanner(System.in);
		
//		int n = scan.nextInt();
//		
//		for(int i = 1; i<=n/2; i++) {
//			if(n % i == 0) {
//			System.out.println(i);
//			}
//		}
//		System.out.println(n);
//		
		// Q. 2) WAJP to find sum of all the factors of a number
		
//		int num = scan.nextInt();
//		int sum = 0;
//		
//		for(int i = 1; i<=num/2; i++)
//		{
//			if(num % i == 0) {
//				sum = sum + i;
//				System.out.println(i);
//			}
//		}
//		System.out.println(num);
//		sum = sum +num;
//		System.out.println("Sum: "+ sum);
		
		
		// Q. 3) WAJP to check whether the number is Prime or not
		
		int n = scan.nextInt();
		int count = 1;
		
		if(n == 1 || n == 0) {
			System.out.println("Not a Prime number");
			return;
		}
		for(int i = 1; i <=n/2; i++)
		{
			if (n % i == 0) {
				count ++;
			}
		}
		if (count == 2) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a Prime number");
		}
		
		// Q. 4) WAP to find all the prime numbers in between 1-100
		
//		for(int n = 1; n<=100; n++)
//		{
//			int count = 1;
//			for(int i = 1; i<=n/2; i++) {
//				
//				if(n % i == 0) {
//					count++;
//				}
//			}
//			if (count == 2) {
//				System.out.println(n);			
//				} 
//		}
		
	}

}



