package collections;

import java.util.ArrayList;

public class Contains {

	public static void main(String[] args) {
		ArrayList<String> ls = new ArrayList<>();
		ls.add("Apple");
		ls.add("Mango");
		ls.add("Pine Apple");
		ls.add("Jack Fruit");
		ls.add("Banana");
		System.out.println(ls.contains("Apple")? "Apple is present":"Not present");
	}
}
