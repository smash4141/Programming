package programming;


import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		// WAJP to convert decimal to binary
		// we have to print the result in reverse that's why we use binary var as String
		// 
		
		Scanner scan = new Scanner(System.in);
		
//		int n = scan.nextInt();
//		String binary = "";
//		
//		while (n != 0) {
//			int remainder = n % 2;
//			binary = remainder + binary;
//			n = n/2;
//		}
//		System.out.println(binary);
		
		// Q. 2) WAJP to convert decimal to Octal
		
		int n = scan.nextInt();
		String octal = "";
		while(n != 0) {
			int remainder = n % 8;
			octal = remainder + octal;
			n = n/8;
		}
		System.out.println(octal);
	}
}

