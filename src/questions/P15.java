package questions;

import java.util.Scanner;

public class P15 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int bill = scan.nextInt();
		int sum = 0;
		int count = 0;
		while(bill != 0) {
			int digit = bill % 10;
			for(int i = 1; i <= digit;i++) {
				if (digit % i == 0) {
					count++;
				}
			}
			if(count == 2) {
				sum = sum + digit;
			}
			bill = bill/10;
		}
		System.out.println(sum);
		
		
		// ShortCut
		
//		int n = scan.nextInt();
//		int sum = 0;
//		while(n !=0) {
//			int digit = n%10;
//			if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
//				sum = sum + digit;
//			}
//			n = n/10;
//		}
//		System.out.println(sum);
	}
}
