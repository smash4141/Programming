package programming;
import java.util.Scanner;

public class p10 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			// Q.1) Two numbers are entered through the keyboard. 
			//		Write a program to find the value of one number raised to the power of another.
			//		(Do not use Java built-in method)
			
//			System.out.println("Enter number 1: ");
//			int base = scan.nextInt();
//			
//			System.out.println("Enter number 2: ");
//			int power = scan.nextInt();
//			
//			int result = 1;
//			for(int i = 1; i<=power; i++) {
//				result = result * base;
//			}
//			System.out.println("Result: "+ result);
			
			
			// Q. 2) Write a program that prompts the user to input an integer and 
			//		then outputs the number with the digits reversed. For example, 
			//      	if the input is 12345, the output should be 54321.
			
			System.out.println("Enter the Number: ");
			int num = scan.nextInt();
			
			int reverse = 0;
			
			int temp = num;
			int remainder = 0;
			
			while (temp>0) {
				remainder = temp % 10;
				reverse = reverse * 10 + remainder;
				temp = temp / 10;
			}
			System.out.println("Reverse of "+num+ " is "+ reverse);
			
		}
	




}
