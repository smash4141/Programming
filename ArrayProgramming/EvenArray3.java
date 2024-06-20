package ArrayProgramming;

public class EvenArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] b = {2,4,5,6,7,8,9,10};

//using for loop
for(int i=0;i<b.length; i++) {
	if(b[i]%2==0) {
	System.out.println(b[i]);
}

}
System.out.println("------------------------");

//using for each loop
for(int i:b) {
	if(i%2==0) {
		System.out.println(i);
	}
}

	}

}
