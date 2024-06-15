package questions;

import java.util.Scanner;

public class P16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int temp = n;
		int sum = 0;
		while(n!=0) {
			int digit = n % 10;
			sum = sum +digit;
			n = n/10;
		}
		if (temp/sum == 0) {
			System.out.println("It's a Harshad number");
		}else {
			System.out.println("not a Harshad number");
		}
	}
}
