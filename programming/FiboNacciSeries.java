package programming;

public class FiboNacciSeries {
	public static void main(String[] args) {
		// Q. 1) WAJP to print the first 10 numbers from fibonacci series
		
//		int n=10;
//		int a = 0, b=1, c=0;
//		
//		System.out.print(a + " " + b + " ");
//		for(int i = 1; i <= n-2; i++) {
//			c = a + b;
//			System.out.print(c + " ");
//			a = b;
//			b = c;
//		}
		
		// Q. 2) WAJP to print nth fibonacci number from the series.
		
		int n = 8;
		int a = 0, b = 1, c = 0;
		
		for(int i = 1; i <= n-2; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(c);
	}
}
