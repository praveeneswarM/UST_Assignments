package collections;

import java.util.HashSet;

public class Colours {
	public static void main(String[] args) {
		HashSet<String> s=new HashSet<>();
		s.add("Bule");
		s.add("Yellow");
		s.add("Red");
		s.add("Black");
		s.add("White");
		for(String i:s)
			System.out.println(i);
	}

}
