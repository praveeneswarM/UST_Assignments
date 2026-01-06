package collections;

import java.util.ArrayList;

public class Course {

	public static void main(String[] args) {
		ArrayList<String> ls = new ArrayList<>();
		ls.add("Java");
		ls.add("Javascript");
		ls.add("HTML");
		ls.add("MySQL");
		ls.add("Spring Boot");
		for(String i:ls)
			System.out.println(i);
	}

}
