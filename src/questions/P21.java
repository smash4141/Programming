package questions;

import java.util.Scanner;

public class P21 {

	public static void main(String[] args) {
		
		//WAJP to check if the number is a ArmStrong number or not.
		
//		in Armstrong number 1) we have to find the digit count present in number
//		2) then the digit count becomes the power and raised to the separated digits.
//		3) then sum of the res of above 2) step 
		
//		example- n= 153
//				1(3) + 5(3) + 3(3) = 1 + 125 + 27 = 153
//				then compare this with number
		
		Scanner scan = new Scanner(System.in);
	
		int n = scan.nextInt();
		int sum = 0;
		int temp = n;
		int digitCount = countDigits(n);
	
		while(n!=0)
		{
			int digit = n % 10;
			sum = sum + pow(digit, digitCount);
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not a Armstrong number");
		}
	}
	public static int pow(int n,int power) {
		int res = 1;
		for(int i = 1; i<=power; i++)
		{
			res = res * n;
		}
		return res;
	}
	
	public static int countDigits(int n) {
		int count = 0;
		while(n != 0)
		{
			count ++;
			n = n/10;
		}
		return count;
	}
}
