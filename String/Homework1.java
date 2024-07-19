package String;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s ="Meet me at the clock tower";
String [] a=s.split(" ");

for(int i=0; i<a.length; i++) {
	int x = i%3;
	if(x==0) {
		a[i] = vowels(a[i]);
	}
	else if(x==1) {
		a[i] = consonant(a[i]);
	}
	else if(x==2) {
		a[i] = a[i].toUpperCase();
	}
	System.out.print(a[i]+ " ");
	
}
	}

	
	public static String vowels(String s) {
		char[] ch = s.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>='A' || ch[i]<='Z' || ch[i]>= 'a' || ch[i]<='z') {
				if(ch[i]=='A' || ch[i] =='E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U' ||
						ch[i]=='a' || ch[i] =='e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
					ch[i] = '%';
				}
		}
		
	}
		return new String(ch);
	}



public static String consonant(String s) {
	char[] ch = s.toCharArray();
	for(int i=0; i<ch.length; i++) {
		if(ch[i]>='A' || ch[i]<='Z' || ch[i]>= 'a' || ch[i]<='z') {
			if(ch[i]!='A' && ch[i] !='E' && ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'U' &&
					ch[i]!='a' && ch[i] !='e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u') {
				ch[i] = '#';
			}
	}
	
}
	return new String(ch);
}

}
