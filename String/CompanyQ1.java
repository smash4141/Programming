package String;

public class CompanyQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "aa abc@ sad$ hsagd^";
int count = 0; 
for(int i=0; i<s.length(); i++) {
	char ch = s.charAt(i);
	
	//skiping all the numbers, small letter, capital letter & space all other than this is special character
	if(!(ch>='a' && ch<='z') && !(ch>='A' && ch <= 'Z')
			&& !(ch>='0' && ch<= '9') && ch!= ' ') {
		count++;
	}
	
}
System.out.println(count);
	}

}
