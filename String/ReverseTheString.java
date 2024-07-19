package String;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// wajp to reverse the string
		
		String s="rajkumar";
		String srev="";
		for(int i=s.length()-1; i>=0;  i--) {
			srev = srev+s.charAt(i);
		}
		System.out.println(srev);
	}
}
