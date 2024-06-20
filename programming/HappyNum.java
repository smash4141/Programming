package programming;


import java.util.Scanner;

public class HappyNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// WAJP to check if the number is a Happy number or not.
		//  A Happy number is  a number which eventually reaches 1 when replaced by 
		//  the sum od the square of each digit.
		// example n = 28 = 2^2 + 8^2 = 4 + 64 = 68
		//			68 = 6^2 + 8^2 = 36 + 64 = 100
		//			100 = 1^2 + 0^2 + 0^2 = 1 + 0 + 0 = 1
		// 			n = 1; that's why it is a Happy Number
		
		int n = scan.nextInt();
		while(n != 1 && n != 4) {
			n = digitSquareSum(n);
		}
		if (n == 1) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not a Happy Number");
		}
	}
	public static int digitSquareSum(int n) {
		int sum = 0;
		
		while(n != 0) {
			int digit = n%10;
			sum = sum + (digit * digit);
			n = n/10;
		}
		return sum;
	}
}
