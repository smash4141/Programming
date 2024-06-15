package assignmentQuestions;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count = 0;
		while(n != 0) {
			int remainder = n % 2;
			if(remainder == 1) {
				count ++;
			}
			n = n/2;
		}
		System.out.println(count);
	}
}
