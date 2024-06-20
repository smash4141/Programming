package ArrayProgramming;

import java.util.*;

public class ReverseEachElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);


int [] a = {45,78,96,47};

for(int i=0; i<a.length; i++) {
	
	int temp = a[i];
	int rev=0;
	while(temp != 0){
		int digit = temp%10;
		rev = rev*10 + digit;
		temp= temp/10;
	}
	
	System.out.print(rev + " ");
}

	}
	}
