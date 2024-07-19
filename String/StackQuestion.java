package String;
import java.util.Stack;
public class StackQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="({}[])";
Stack<Character> stack = new Stack<>();
for(int i=0; i<s.length(); i++) {
	if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
		stack.push(s.charAt(i));
		continue;
	}
	else if(stack.isEmpty()) {
		System.out.println("Not Valid");
	return;
	}
	char pop=stack.pop();
	switch (pop) {
	case '{':
		if(s.charAt(i)==']' || s.charAt(i)==')') {
			System.out.println("Not Valid");
			return;
		}
		break;
	case '(':
		if(s.charAt(i)==']' || s.charAt(i)=='}') {
			System.out.println("Not Valid");
			return;
		}
		break;
	case '[':
		if(s.charAt(i)=='}' || s.charAt(i)==')') {
			System.out.println("Not Valid");
			return;
		}
		break;
	}
}
if(stack.isEmpty()) {
	System.out.println("valid");
}
else {
	System.out.println("Not Valid");
}
	}

}
