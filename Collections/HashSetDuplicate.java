package collections;
import java.util.*;
public class HashSetDuplicate {
	public static void main(String[] args) {
		HashSet<Integer> s=new HashSet<>();
		s.add(5);
		s.add(4);
		s.add(2);
		s.add(4);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(3);
		System.out.println(s);
	}

}
