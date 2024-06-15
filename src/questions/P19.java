package questions;

import java.util.Scanner;

public class P19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//WAJP to reverse the given number
		
		int n = scan.nextInt();
		int reverse = 0;
		int temp = n;
		while(n!=0) {
			int digit = n %10;
			reverse = reverse * 10 + digit;
			n = n/10;
		}
		System.out.println("Reverse: "+reverse);
	}
}
