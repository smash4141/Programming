package programming;

import java.util.Scanner;

public class OctalToBinary {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sum = 0;
		int p = 1;
		while(n != 0) {
			int digit = n % 10;
			sum = sum + digit*p;
			p = p*8;
			n = n/10;
		}
		System.out.println("Octal:" +sum);
		
		String binary = "";
		
		while(sum != 0) {
			int remainder = sum % 2;
			binary = remainder + binary;
			sum = sum/2;
		}
		System.out.println("Binary: " +binary);
	}
}
