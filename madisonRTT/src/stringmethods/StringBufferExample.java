package stringmethods;

public class StringBufferExample {

	public static void main (String[] args) {
		// change to be abc123xyz
		String x = "abcxyz";
		String x1 = x.substring(0,3) + "123" + x.substring(3);
		
		String y = x.toUpperCase();
		
		// zybca
		
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("abc");
		buffer.append("xyz");
		
		buffer.reverse();
		
		String sub = buffer.substring(0,3);
		
		buffer.insert(3, "123");
		
		System.out.println(buffer.toString());
		
		
	}
}
