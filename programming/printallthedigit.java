package programming;
import java.util.Scanner;


public class printallthedigit {



	

		
		public static void main(String[] args) {
			// Q. 1) WAJP to print all the digits of a number.
			
			Scanner scan = new Scanner(System.in);
			
//			int n = scan.nextInt();
//			
//			while (n != 0) {
//				int digit = n % 10;
//				System.out.println(digit);
//				n = n/10;
//			}
			
			// Q. 2)WAJP to print all the odd digits from the number.
			
//			int n = scan.nextInt();
//			
//			while(n != 0)
//			{
//				int digit = n % 10;
//				if(digit % 2 != 0) {
//					System.out.println(digit);
//				}
//				n = n/10;
//			}
			
			// Q. 3) WAJP to print the sum of the digits in the number.
			
			int n = scan.nextInt();
			int sum = 0;
			while(n!=0)
			{
				int digit = n % 10;
				sum = sum + digit;
				n = n/10;
			}
			System.out.println(sum);
		}
	
}
