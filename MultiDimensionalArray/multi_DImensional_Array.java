package MultiDimensionalArray;

public class multi_DImensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a= {{1,2,4,3},{5,7,8},{10,20,30}};
		
		//wajp to find largest elements in Array
		for(int i=0; i<a.length; i++) {
			int large=a[i][0];
			for(int j=0; j<a[i].length;j++) {
				if(a[i][j]>large) {
					large=a[i][j];
				}
			}
			System.out.println(large);
		}
	}
}
