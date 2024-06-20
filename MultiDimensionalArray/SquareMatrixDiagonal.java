package MultiDimensionalArray;

public class SquareMatrixDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[][] a = {{1,2,3},{4,5,6},{9,8,9}};
//		int[][] a= {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
	
				if(i==j || i+j==a.length-1) {
				 sum=sum+a[i][j];
			}
			
		}
		}
		System.out.println(sum);
	}
}
