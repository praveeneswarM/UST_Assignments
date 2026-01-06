package collections;

import java.util.ArrayList;

public class ClearArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ls = new ArrayList<>();
		ls.add(5);
		ls.add(4);
		ls.add(3);
		ls.add(2);
		ls.add(1);
		System.out.println(ls);
		ls.clear();
		System.out.println(ls);
	}

}
