package MultiDimensionalArray;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] a= {{1,2,3},{4,5,6},{7,8,9}};


for(int i=0; i<a.length; i++) {
	for(int j=0; j<a[i].length;j++) {
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}

System.out.println("Transpose of matrix is:");
for(int i=0; i<a.length; i++) {
	for(int j=0; j<a[i].length;j++) {
		
		// For transposing means interchanging rows into column & column into rows 
		// printing column first then row i.e [j] is column & [i] is row
		
		System.out.print(a[j][i]+" ");
	}
	System.out.println();
}

	}
}
