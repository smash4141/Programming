package programming;
import java.util.Scanner;


public class p12 {


		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			int n = scan.nextInt();
			int count = 1;
			int finalCount = 0;
			for(int i = 1; i<n; i++) {
			
				for(int j = 1; j < i; j++)
				{
					if (i % j == 0) {
						count ++;
					}
				}
				if (count == 2 ) {
					System.out.println(i);
					finalCount ++;
				}
			}
			
			System.out.println(finalCount);
		}
	}

