package String;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="tommorow is result day";

String [] r=s.split(" ");

for(int i=0; i<r.length; i++) {
char[]	 ch = r[i].toCharArray();
if(ch[0]>='a'&& ch[0] <='z') {
	ch[0]=(char)(ch[0]-32);
}
//r[i] = new String(ch);
//System.out.print(r[i]+ " ");

String res = new String(ch);
System.out.print(res+ " ");
}
}
	}


