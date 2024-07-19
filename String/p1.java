package String;

/* 
 
 String :- 
 * It is a final class present in java.lang package 
 * objects created using string class are immutable
 
 * String class inherits 3 interfaces:
 1. charSequence Interface
 2. Comparable Interface
 3. Serializable Interface

How to create string object:-

1. Using String Literals
Syntax:- 
String Variable = String literal;
eg:- String s = "Orange";

* If we create a string a object using string literals it will check the string constant pool
* If the object exists or not:-
 if exists it will return the address of the same object 
 if not exists then it will create a new object
 
  2. using string new keyword
  String variable = new String(String literal);
 Eg.: String s = new String("Kaju Katli");
 
 If we create a string object using new keyword objects will be created in a heap area
 and the address will be return and also the objet will be created in string constant pool


*/


public class p1 {
	
	public static void main(String[] args) {
	
		// 1. Using String Literals
String s1 = "orange";
String s2 = "orange";
System.out.println(s1==s2);

	//2. using string new keyword
String s3 = new String("kaju katli");
String s4 = new String("kaju katli");
System.out.println(s3 == s4);

	}

}
