package ArrayProgramming;

public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {9,6,4,2,3,5,7,0,1};

int total = 0;
//printing total from range 0 to 9
for(int i=0;i<=9; i++) {
	total = total + i;
}

//printing total for array
int sum = 0;
for(int i=0; i<a.length;i++) {
	sum =  sum +a[i];
}

//finding missing number 
sum =total-sum;
System.out.println(sum);
	}

}
