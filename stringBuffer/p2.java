package stringBuffer;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Python");
		System.out.println(sb);
		
		sb.append("Programming Language");
		System.out.println(sb);
		
		sb.insert(6, " ");
		System.out.println(sb);
		
		sb.delete(7,19);
		System.out.println(sb);
		
		sb.replace(0, 6, "java");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		// 1.StringBuffer append(String s)
		// It is used the specified string with this string. The append() method is overloaded like append(char), apend(int), append(float), append(double),etc.
		
//		2.StringBuffer insert(int offset, String s)
		// It is used to insert the specified string with this string at the specified position.
		// insert() method is overloaded like insert(int, char), insert(int, boolean), insert(int, int ) insert(int, float), insert(int,double) etc.
		
//		3. StringBuffer replace(int startIndex, int endIndex, String str)
//		it is used to replace the string from specifed startIndex and endIndex
		
//		4.StringBuffer replace(int startIndex, int endIndex)
//		It is used to delete the string from specified startIndex and endIndex.
		
//		5. StringBuffer reverse()
//		it is used to reverse the string
		
		}

}
