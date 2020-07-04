package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestCollection {
	public static void main(String[] args){
		List<String> list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		Iterator<String> it = list.iterator();
		
		/**
		 * ListIterator<String> iter1 = list.listIterator();
		 * ListIterator<String> iter2 = list.listIterator();
		 * iter1.next();
		 * iter1.remove();
		 * iter2.next();
		 * it will be Exception in thread "main" java.util.ConcurrentModificationException
		 * 
		 */
		
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
