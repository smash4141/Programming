package String;
import java.util.Set;
import java.util.TreeSet;

public class PangramSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="thequickbrownfoxjumpsoverthelazydog";

//int[] alpha = new int[26];
//for(int i=0; i<s.length(); i++) {
//	if(s.charAt(i)>='a' && s.charAt(i)<='z') {
//		int index=s.charAt(i)-'a';
//		alpha[index]++;
//	}
//}
//boolean isPangram=true;
//for(int i=0; i<alpha.length; i++) {
//	if(alpha[i])==j0
//}

s=s.toLowerCase();
Set<Character> set = new TreeSet();
for(int i=0; i<s.length(); i++) {
	if(s.charAt(i)>='a' && s.charAt(i)<='z') {
		set.add(s.charAt(i));
	}
}

if(set.size()==26) {
	System.out.println("true");
}
else {
	System.out.println("false");
}

	}

}
