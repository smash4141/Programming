package String;

import java.util.*;

public class PercentageOfCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String a = "Hello123@123";

int Ucount=0;
int Lcount=0;
int Dcount=0;
int SCcount=0;

for(int i=0; i<a.length(); i++) {
char b=a.charAt(i);
	
   if(b>='a' && b<='z') {
		Lcount++;
	}
   else if(b>='A' && b<='Z') {
		Ucount++;
	}
	else if(b>='0' && b<= '9') {
		Dcount++;
	}
	
	else {
		SCcount++;
	}

}

System.out.println(Ucount);
System.out.println(Lcount);
System.out.println(Dcount);
System.out.println(SCcount);

float total= SCcount+Lcount+Dcount+Ucount;
System.out.println(total);

System.out.println((Ucount/total)*100);
System.out.println((Lcount/total)*100);
System.out.println((Dcount/total)*100);
System.out.println((SCcount/total)*100);
	
	}
}
