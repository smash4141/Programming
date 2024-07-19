package String;

public class splitwithoutInbuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="my name is amruta";
String s1="";
int i=s.length()-1;
int count=0;

while(i>=0) {
	if(s.charAt(i) != ' ') {
		s1=s.charAt(i)+s1;	
	}
	
	else {
		System.out.print(s1+" ");
		s1="";
		count++;
	}
	i--;
}

System.out.println(s1);
System.out.println(count);
	}

}
