package String;
import java.util.*;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String a = sc.nextLine(); //tan
String b = sc.nextLine(); //nat

if(a.length()==b.length()) {
	char[] c = a.toCharArray();
	char[] c1 = b.toCharArray();
	
	Arrays.sort(c);
//	Arrays.sort(c1);
	for(int i= 0; i<c1.length; i++) {
		for(int j=0 ; j<c1.length-1; j++) {
			if(c1[j]>c1[j+1]) {
				char temp = c1[i];
				c1[i]=c1[j];
				c1[j]=temp;
			}
		
		}
		
	}
	
	boolean isAnagram = true;
	for(int i=0; i<c1.length; i++) {
		if(c[i] != c1[i]) {
			isAnagram = false;
			break;
		}
		
	}
	
	if(isAnagram) {
		System.out.println("It is an anagram");
	}
	else {
		System.out.println("It is not anagram");
	}
	
}

else {
	System.out.println("It is not an anagram");
}

	}
}
