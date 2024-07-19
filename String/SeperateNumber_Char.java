package String;
import java.util.*;

public class SeperateNumber_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String s = "1MU2M3BA4I";
String res="";
int count=0;
int digit=0;
for(int i = 0; i<s.length(); i++) {
	
	char c = s.charAt(i);
	
	if(c>='A' && c<='Z') {
		count++;
		res = res+c;
	}
	
	else if(c>='0' && c<='9') {
		digit=digit+(c-'0');
	}
	
	else {
		System.out.println("Not a valid Input");
	}
	
}

System.out.println(count+res+digit);
	}

}
