package programming;
import java.util.Scanner;

public class countDigit {


		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			// Wajp to count the number of digits present in the input.
			
			int n = scan.nextInt();
			int count = 0;
			while(n!=0) {
				count ++;
				n = n/10;
			}
			System.out.println("Count: "+ count);
		}


}
