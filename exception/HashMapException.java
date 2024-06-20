package exception;
import java.util.*;
public class HashMapException {
	public static void main(String[] args) {
		HashMap<String, Integer> a = new HashMap();
		Scanner sc = new Scanner(System.in);
		a.put("akash",10);
		a.put("aka",15);	
		try {
			a.put(sc.next(),sc.nextInt());
			a.put(sc.next(),sc.nextInt());
			a.put(null, null);
			}	
		catch(InputMismatchException r){
			System.out.println("Input mismatch");
			}
		catch(NullPointerException r){
			System.out.println("Null Input");
		}
		catch(Exception r){
			System.out.println("Invalid Input");
		}
		
		System.out.println("HashMap : "+a);
	}
}
