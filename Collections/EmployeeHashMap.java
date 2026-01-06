package collections;

import java.util.HashMap;

public class EmployeeHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> emp=new HashMap<>();
		emp.put(1, "Praveen");
		emp.put(2, "Bhavesh");
		emp.put(3, "Adharsh");
		emp.put(4, "Ashwin");
		
		System.out.println(emp.get(4));
	}

}
