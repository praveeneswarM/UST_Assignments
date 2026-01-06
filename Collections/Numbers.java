package collections;

import java.util.ArrayList;

public class Numbers {

	public static void main(String[] args) {
		ArrayList<Integer> ls = new ArrayList<>();
		ls.add(5);
		ls.add(4);
		ls.add(3);
		ls.add(2);
		ls.add(1);
		ls.remove((Object)(2));
		for(int i:ls)
			System.out.println(i);
		
	}

}
