package ArrayProgramming;

public class LargeSmallAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {1,4,3,2};

int large=a[0];
int small=a[0];
int count=0;
double sum=0;

for(int i=0; i<a.length; i++) {
		
		if(a[i]>large) {
			large=a[i];
		}
		
		else if(a[i]<small) {
			small=a[i];
		}
		
}

for(int i=0; i<a.length; i++) {
	if(a[i]==large || a[i]==small) {
		count++;
		sum=sum+a[i];
	}
}

System.out.println(small);
System.out.println(large);

System.out.println(sum);
System.out.println(count);

double average= sum/count;
System.out.println(average);
	}
}
