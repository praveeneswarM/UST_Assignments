package collections;

import java.util.HashMap;
import java.util.Map;

public class CountryCodeAndName {

	public static void main(String[] args) {
		HashMap<String,String> s=new HashMap<>();
		s.put("IN", "India");
		s.put("US", "United States");
		s.put("LK", "Sri Lanka");
		
		for(Map.Entry<String,String> e:s.entrySet()) {
			System.out.println("Code : "+e.getKey()+" Name : "+e.getValue());
		}
		
	}

}
