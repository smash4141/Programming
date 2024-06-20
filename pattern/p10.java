package pattern;

public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5; 
for(int i=1; i<=n; i++) { //rows
	for(int j=1; j<=n; j++) { //space
		if(i+j < n+1) { 
			System.out.print(" ");
		}
		
	}
	for(int j=1; j<=n; j++) { //cols
		if(i>=j) {
		System.out.print("* ");
	}
	
	else {
		System.out.print("  ");
	}
}
	System.out.println();
}

	}

}
