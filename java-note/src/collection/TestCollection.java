package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollection {
	public static void main(String[] args){
		List<String> list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()){ 	
			String s = it.next();
			System.out.println(s);
		}
		while(it.hasNext()){ 	
			String s = it.next();
			System.out.println(s+"----------");
		}
		for(;it.hasNext();){
			String s = it.next();
			System.out.println(s+"===========");
		}
//		lambda表达式
		it.forEachRemaining(s -> System.out.println(s));
//		迭代器的指针没有回调，因此只输出一次

	}
	
}
