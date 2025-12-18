package string;

import java.util.*;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a[]=sc.nextLine().split("");
		String check="";
		String dup="";
		for(int i=0;i<a.length;i++)
		{
			if(!check.contains(a[i]+","))
				check+=a[i]+",";
			else
				dup+=a[i]+",";
				
		}
		System.out.println("Duplicates :");
		System.out.println(dup.replace(',',' '));
		
//		Map<String,Integer> dup = new HashMap<>();
//		for(int i=0;i<a.length;i++)
//			dup.put(a[i],dup.getOrDefault(a[i], 0)+1);
//		System.out.println("Duplicates :");
//		for(Map.Entry<String,Integer> i:dup.entrySet())
//		{
//			if(i.getValue()>1)
//				System.out.println(i.getKey());
//		}
	}

}
