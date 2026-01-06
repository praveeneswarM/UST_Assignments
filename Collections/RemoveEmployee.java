package collections;

import java.util.HashMap;
import java.util.Map;

public class RemoveEmployee {

	public static void main(String[] args) {
		HashMap<Integer,String> emp=new HashMap<>();
		emp.put(1, "Praveen");
		emp.put(2, "Bhavesh");
		emp.put(3, "Adharsh");
		emp.put(4, "Ashwin");
		emp.remove(3);
		for(Map.Entry<Integer,String> e:emp.entrySet())
			System.out.println(e.getValue());
	}

}
