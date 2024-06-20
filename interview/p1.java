package interview;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// final mock square matrix sum of right diagonal & sum of left diagonal then substract them

		int[][] a = {{1,2,3},{4,5,6},{9,8,9}};

			int sum=0;
			int sum1=0;
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
		
					if(i==j) {
					 sum=sum+a[i][j];
				}
					 if(i+j==a.length-1){
						sum1=sum1+a[i][j];
					}
			}
			}
			System.out.println(sum);
			System.out.println(sum1);
			if(sum<sum1) {
				System.out.println(sum1-sum);	
			}
			else {
				System.out.println(sum-sum1);
			}
			
		

	}

}
