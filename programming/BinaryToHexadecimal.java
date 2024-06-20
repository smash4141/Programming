package programming;


import java.util.Scanner;

public class BinaryToHexadecimal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sum = 0;
		int p = 1;
		while(n != 0) {
			int digit = n % 10;
			sum = sum + digit * p;
			p = p * 2;
			n = n/10;
		}
		System.out.println(sum);
		String hexaDecimal = "";
		
		while( sum != 0) {
			int remainder = sum % 16;
			if(remainder > 9) {
				hexaDecimal = (char)(remainder + 55)+hexaDecimal;
			}else {
				hexaDecimal = remainder + hexaDecimal;
			}
			sum = sum/16;
		}
		System.out.println(hexaDecimal);
	}
}
