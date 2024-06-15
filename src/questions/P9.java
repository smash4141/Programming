package questions;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		// WAJP to check if the year is a Leap Year or not
		
		Scanner sc=new Scanner(System.in);
		int year = sc.nextInt();
		if(year %4==0 && year %100!=0 || year %400==0) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not a Leap Year");
		}
	}

}
