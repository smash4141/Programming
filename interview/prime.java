package interview;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		
		//print prime number from 1 to 100
		for( a=0; a<=100; a++) {
			for(b=2; b<a; b++) {
				if(a%b==0)
					break;
			}
	
			if(a==b) {
				System.out.println(a);
				}
		}
		
	}
}
