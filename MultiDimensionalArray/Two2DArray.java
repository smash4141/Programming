package MultiDimensionalArray;
import java.util.*;

public class Two2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of Outer Array: ");
int outerS = sc.nextInt();

System.out.println("Enter the size of Inner Array: ");
int innerS=sc.nextInt();

int[][] b = new int[outerS][innerS];

for(int i=0; i<b.length; i++) {
	for(int j=0; j<b[i].length; j++) {
		System.out.println("Enter the Element for "+i+" "+j);
		b[i][j]=sc.nextInt();
	}
}

for(int i=0; i<b.length;i++) {
	for(int j=0; j<b[i].length;j++) {
		System.out.print(b[i][j]+" ");		
	}
//	System.out.println();
}

	}

}
