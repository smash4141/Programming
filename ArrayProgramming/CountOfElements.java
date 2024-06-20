package ArrayProgramming;

public class CountOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int [] a= {2,2,2,2,2};
		int[] a = {1,3,2,4,5};
		
		int sum=0;
		int count=0;
		
		for(int i = 0;i<a.length; i++) {
			sum = sum +a[i];
		}
		
			int average=sum/a.length;
			
			for(int i=0; i<a.length; i++) {
				if(average==a[i]) {
					count++;
		}
		}
		
		System.out.println(count);	
		
	
	}
}
