package MultiDimensionalArray;

public class Two1DArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{1,5,4,6},{2,4,6},{11,12,14,56,6}};
		
		for(int i=0; i<a.length; i++) { //Outer Array
			for(int j=0; j<a[i].length; j++) { //Inner Array
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}	
	}

}
