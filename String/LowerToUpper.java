package String;

// wap to convert all lowercase alphabets into uppercase alphabets without using inbuilt method 

import java.util.*;

public class LowerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char [] ch = a.toCharArray();
		
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		
for(int i=0; i<ch.length; i++) {
if(ch[i]>='a' && ch[i] <= 'z') {
	ch[i] = (char)(ch[i]-32);
}
}

String res = new String(ch);
System.out.println(res);
	}
}
