package questions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

class A {
	String s = "mango";
	String path = "C:\\Users\\rajku\\OneDrive\\Desktop\\New folder\\output.txt";
	
	public void printToTextFile() throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream(path);
		PrintWriter pw = new PrintWriter(fos);
		
		for(int i = 0; i<s.length(); i++) {
			pw.write(s.charAt(i));
		}
	}
}
public class P5 {
	
}
