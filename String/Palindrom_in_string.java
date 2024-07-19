package String;

public class Palindrom_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "madam";
		String a="";
		for(int i = s.length()-1; i>=0; i--) {
			a=a+s.charAt(i);
		}
		System.out.println("Reverse: "+a);
		if(a.equalsIgnoreCase(s)) {
			System.out.println("Given String is palindrime String");
		}
		else {
			System.out.println("Not a Palindrome String");
		}
		
	}

}
