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
		System.out.println(s);
		byte a = 87;
		byte b = 79;
		byte c= (byte)(a+b);
		System.out.println(c);
		double d = 1e200;
		float e = (float)d;
		System.out.println(e);
		int h = -11%3;
		int l = -11/3;
		System.out.println(h);
		System.out.println(l);
		int ll = 3;
		int ds = (++ll);
		System.out.println(ll);
		System.out.println(ds);
		boolean o = false;
		boolean dd = false;
		System.out.println(o^dd);
		
	}

}