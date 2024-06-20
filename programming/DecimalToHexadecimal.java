package programming;

import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Q. 1) WAJP to convert decimal to hexadecimal
		//  	 10 --> A --> 65
//				 11 --> B --> 66
//				 12 --> C --> 67
//				 13 --> D --> 68
//				 14 --> E --> 69
//				 15 --> F --> 70
		//65-10 = 55, 66-11 = 55,67-12 = 55....
		// for small alphabet take the difference 87
		// for capital alphabet take the difference 55 
		int n = scan.nextInt();
		
		String hexadecimal = "";
		
		while(n != 0) {
			int remainder = n % 16;
			if (remainder > 9) {
				// Here we are adding the remainder with 55 means 10 + 55 = 65 then char(65) = A
				hexadecimal = (char)(remainder + 55) + hexadecimal;
			} else {
				hexadecimal = remainder + hexadecimal;
			}
			n = n/16;
		}
		System.out.println(hexadecimal);
	}
}
