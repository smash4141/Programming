package practice;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		
		// Q. Write a program to calculate the sum of first 10 natural number.
		
		Scanner scan = new Scanner(System.in);
		
//		int n = scan.nextInt();
//		int sum = 0;
//		for(int i = 1; i<=n; i++) {
//			sum = sum + i;
//		}
//		System.out.println("Sum: " + sum);
		
		
		// Q. 2) Write a program that prompts the user to input a positive integer. 
		//		It should then print the multiplication table of that number. 
		
//		int num = scan.nextInt();
		
//		for(int i = 1; i<=10; i++)
//		{
//			System.out.println(num + " x "+ i + " = " + (num*i));
//		}
		
		// While loop
//		int num = scan.nextInt();
//		int i = 1;
//		while (i<=10) {
//			System.out.println(num + " x "+ i + " = " + (num*i));
//			i++;
//		}
		
		// Q. 3) Write a program to find the factorial value of any number entered through the keyboard. 
		
		int m = scan.nextInt();
		int fact = 1;
		
//		for(int i = 1; i<=m; i++)
//		{
//			fact = fact * i;
//		}
//		System.out.println("Factorial: "+fact);
		
		// While loop
		
		int i=1;
		while(i<=m) {
			fact = fact *i;
			i++;
		}
		System.out.println("Factorial: "+ fact);
	}
}







