package exception;

import java.util.*;

public class C13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList();
		
		
		try {
			a.add(sc.nextInt());
			a.add(sc.nextInt());
			a.add(sc.nextInt());
		}
		
		catch(InputMismatchException r){
			System.out.println("Invalid Input");
		}
		
		System.out.println("Input : "+a);
	}
}