import java.util.ArrayList;

public class IndexinList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(5);
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		
		int pos = arr.indexOf(3);
		
		System.out.println("The index of 3 is " + pos);

}

}