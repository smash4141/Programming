package String;

public class SplitMethod {
	//only position will reverse not the elements of word
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="My name is Akash";
String[] a=s.split(" "); //divide on space 
for(int i=a.length-1; i>=0; i--) {
	System.out.print(a[i]+" ");
}
	}

}
