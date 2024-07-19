package String;
import java.util.*;

public class PasswordCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password: ");
		String s=sc.nextLine();
		
		if(s.length()>=8) {
			boolean upper=false, lower=false, digit = false, special = false;
			
			for(int i=0; i<s.length(); i++) {
				char ch=s.charAt(i);
				
				if(ch>='A' && ch<='Z') {
					upper=true;
				}
				else if(ch>='a' && ch<='z') {
					lower=true;
				}
				else if(ch>='0'&& ch<='9') {
					digit=true;
				}
				else {
					special = true;
				}
			}
			
			if(upper && lower && special && digit) {
				System.out.println("Strong password");
			}
			else {
				System.out.println("Not strong password");
			}
			
		}
		
		else {
			System.out.println("your password is not valid");
		}
		
	}
}
