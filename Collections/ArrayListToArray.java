package collections;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> ls = new ArrayList<>();
		ls.add("Chennai");
		ls.add("Salem");
		ls.add("Banglore");
		ls.add("Madurai");
		ls.add("Trichy");
		
		String arr[]=ls.toArray(new String[0]);
		for(String i:arr)
			System.out.println(i);
	}

}
