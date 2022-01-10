
public class Palindrome_String {

	public static void main(String[] args) {
		
		String org = "Hello";
		
		StringBuffer s = new StringBuffer(org);
		
		String rev = s.reverse().toString();
		
		System.out.println(rev);
		
		if (org == rev) {
			
			System.out.println("The given string is palindrome");
		}
		
		else {
			
			
			System.out.println("The given string is not palindrome");
		}

	}

}
