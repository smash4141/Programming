package stringBuffer;

public class p1 {

	//	StringBuffer:-
	//	It is defined in jva.lang package
	//  StringBuffer class is similar to string class except it is mutable
	//  This class is used to create a mutable {modifiable} String object
	//	It is thread safe i.e multiple threads cannot access it simultaneously.
	
	public static void main(String[] args) {
		String s = "Qspider";
		System.out.println(s);
		
		s=s.concat(" Thane");
		System.out.println(s);

		StringBuffer sb = new StringBuffer("Jspider");
		System.out.println(sb);
		
		sb.append(" Thane");
		System.out.println(sb);


	}
}
