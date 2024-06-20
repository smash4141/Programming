package interview;

public class p2 {
//final mock question 2 with pattern having pyramid
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=6;
for(int i=1; i<=a; i++) {
	for(int j=1; j<=a; j++) {
		if(i+j<a+1) {
			System.out.print(" ");
		}
	}
	for(int j=1; j<=a; j++) {
		if(i>=j) {
			System.out.print(i+" ");
		}
		else {
			System.out.print("");
		}
	}
	System.out.println();
}
	}

}
