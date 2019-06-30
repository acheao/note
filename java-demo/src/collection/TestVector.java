package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class TestVector {
	public static void main(String[] args){
		List<String> vector = new Vector();
		vector.add("AAAAAA");
		vector.add("BBBBBB");
		vector.add("CCCCCC");
		vector.add("DDDDDD");
		System.out.println(vector);
		
		HashSet hashSet = new HashSet();
		
		Map map = new HashMap();
		map.put("11111", new Object());
		String s = (String) map.getOrDefault("2", "Wrong");
		System.out.print(s);
		
	}

}