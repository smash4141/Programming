package programming;

import java.util.Scanner;

public class p7 {

	public static void main(String[] args) {
		
		
		// Q. Write a code to Swap two numbers by using third variable.
		
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = 0;
//		c = a;
//		a = b;
//		b = c;
//		
//		
//		System.out.println(a);
//		System.out.println(b);
		
		// Write a code to Swap two numbers without using third variable.
		
		int a = 10;
		int b = 20;
		
		a = b+a;
		b = a-b;
		a = a-b;
		
		System.out.println(a);
		System.out.println(b);
	}

}
