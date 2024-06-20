package MultiDimensionalArray;

public class SumOfArray {

	// sum of 2D Array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] a= {{1,2,4,3},{5,7,8},{10,20,30}};

for(int i=0; i<a.length; i++) {
	int sum=0;
	for(int j=0; j<a[i].length;j++) {
		sum = sum + a[i][j];
	}
	System.out.println(sum);
}
	}

}
