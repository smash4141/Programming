package String;

public class CountTheRepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="xxhixxxxxhixxhixhi";
int count=0;
System.out.println(countHi(s));
	}
	
	
public static int countHi(String s) {
if(s.indexOf("hi") != -1) {
	return 1+ countHi(s.substring(s.indexOf("hi")+2));
}

else{
	return 0;
}
}


}
