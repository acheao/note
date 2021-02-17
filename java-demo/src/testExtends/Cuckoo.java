package testExtends;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Cuckoo extends Bird implements InterfaceA{
	public Cuckoo(String a) {
		super(a);
	}

	public String getTest(){
		
		return this.getEye();
	}
	
	public  static void main(String[] args){
		String a = "AAAAA";
		Cuckoo cK = new Cuckoo(a);
		System.out.println(cK.getTest());
		Bird b = new Bird(a);
		InterfaceA.method();
		InterfaceB.method();
		System.out.println(Objects.hashCode(a));
		Point p = new Point(10,10);
		System.out.println(cK.toString());
		System.out.println(p.toString());
		int[] lustion = {1,2,334,21,12};
		System.out.println(lustion.toString());
		System.out.println(Arrays.toString(lustion));
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.remove(0);
		list.add(1, 10);
		Integer[] al = new Integer[list.size()];
		list.toArray(al);         
		System.out.println(Arrays.toString(list.toArray()));
		
		
	}
	

}
