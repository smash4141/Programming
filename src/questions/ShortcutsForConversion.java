package questions;

public class ShortcutsForConversion {

	public static void main(String[] args) {
		
		// Shortcuts to convert the Decimal to other
		
		int n = 15;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toOctalString(n));
		System.out.println(Integer.toHexString(n));
		System.out.println("-----------------");
		
		// Shortcut to convert the other into decimal
		System.out.println(010);
		System.out.println(0B1101);
		System.out.println(0XA);
	}
}
