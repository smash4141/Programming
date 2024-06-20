package String;
import java.util.*;

public class ConvertTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
String s = sc.nextLine();
char a[] = s.toCharArray();

for(int i = 0; i<a.length; i++) {
	
	if(a[i]>='a' && a[i] <='z' ) {
		a[i]=(char)(a[i]-32);
	}
		else if(a[i]>='A' && a[i]<='Z') {
			a[i]=(char)(a[i]+32);
	}
	
}

String res = new String(a);
System.out.println(res);
		
	}

}
