package String;

public class sosProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "SOSSOS";
String original = "";

int n=s.length()/3;

for(int i=0; i<=n; i++) {
	original = original + "SOS";
}

int count=0;
for(int i=0; i<s.length();i++) {
	if(original.charAt(i) != s.charAt(i)) {
		count++;
	}
}
System.out.println(count);
	}

}
