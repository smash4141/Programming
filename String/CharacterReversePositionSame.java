package String;

public class CharacterReversePositionSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "my name is akash";
String a="";

for(int i=s.length()-1; i>=0; i--) {
a=a+s.charAt(i);
}

String [] b = a.split(" ");

for(int i=b.length-1;i>=0; i--) {
	System.out.print(b[i]+ " ");
}


	}
}
