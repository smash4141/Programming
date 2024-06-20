package interview;
import java.util.Scanner;

public class tcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

System.out.println("Enter First Number : ");	
int a = sc.nextInt();

System.out.println("Enter Second Number : ");	
int b= sc.nextInt();

int sum=0;


for(a=1; a<=b; a++) {
	int d = a*a*a;
	sum = sum +d;
}
System.out.println(sum);

	}

}
