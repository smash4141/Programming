package programming;


import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// WAJP to convert the Octal into decimal
		
		int n = scan.nextInt();
		int sum = 0;
		int p = 1;
		while(n != 0) {
			int digit = n % 10;
			sum  = sum + digit * p;
			p = p * 8;
			n = n/10;
		}
		System.out.println(sum);
	}
}
