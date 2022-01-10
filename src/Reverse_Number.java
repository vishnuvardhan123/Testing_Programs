
public class Reverse_Number {

	public static void main(String[] args) {
		
		StringBuffer rev;
		
		int num = 1234;
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		
		rev = sb.reverse();
		
		System.out.println(rev);

	}

}
