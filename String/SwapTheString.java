package String;

public class SwapTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Orange";
		String s2= "Grapes";
		
		System.out.println("Before Swapping: ");
		System.out.println("S1= "+s1);
		System.out.println("S2= "+s2);
		
		//without third variable
		s1=s1.concat(s2);   //adding both the string and make it long which contains both the string value
		s2=s1.substring(0,s1.length()-s2.length());  //deleting s2 smaller from larger part so first element remains and then store it in s2 new
		s1=s1.substring(s2.length()); //now deleting new s2(s1 older) from s1 longer which gives s1 new

		System.out.println("After Swapping: ");
		System.out.println("S1= "+s1);
		System.out.println("S2= "+s2);
		
		System.out.println("------------------------------------------------------------------------------- ");
		
		//with third variable
		String a = "Akash";
		String b= "Gupta";
		

		System.out.println("Before Swapping: ");
		System.out.println("A= "+a);
		System.out.println("B= "+b);
		
		String temp = a;
		a=b;
		b=temp;

		System.out.println("After Swapping: ");
		System.out.println("A= "+a);
		System.out.println("B= "+b);
		
		
		//concat();
		//substring();
		//s.indexOf();
		//s.lastIndexOf();
		
		
	}

}
