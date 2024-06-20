package ArrayProgramming;

public class SumOfEachDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {74,63,1456,1478};
for(int i=0; i<a.length; i++) {
	System.out.println(sumOfDigits(a[i])+ " ");
}
	}
	
	public static int sumOfDigits(int n) {
		int sum = 0;
		while(n!=0) {
			int digit = n%10;
			sum = sum+digit;
			n=n/10;
			}
		return sum;
	}
}
