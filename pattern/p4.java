package pattern;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
for(int i=1; i<=n; i++) { //rows
	for(int j=1; j<=n; j++) { //cols
		if(i==3|| i==5 ||( (j==1 || j==5 ) && i>=3) || (j==3 && i<=3)) {
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
