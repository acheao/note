import java.util.Date;

public class DateTest {
	private static String a = "aaaaaaa";
	private static String b = "bbbbbbb";
	private static StringBuffer strBuf = new StringBuffer("ccc");
	private static int c;
	
	public static void main(String[] args){
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		long time = System.currentTimeMillis();
		Date today = new Date(time);
		System.out.println(today);
		System.out.println(time);
		today.setTime(1548574684641l);
		System.out.println(today);
		
		Date date1 = new Date(10000);
		Date date2 = new Date(20000);
		System.out.println(date1);
		System.out.println(date2);
		boolean flag = date1.before(date2);
		System.out.println(flag);
		boolean flag2 = date1.after(date2);
		System.out.println(flag2);
		int sub = date1.compareTo(date2);
		System.out.println(sub);
		
		/**
		 * 传参时传的是copy参数的值，而不是参数本身
		 * 而对象传的值则是对象的引用，如果对象本身是可变的，则有可能改变原参数的值
		 */
		addChar(strBuf);
		System.out.println(strBuf);
		swap(a,b);
		System.out.println(a);
		System.out.println(b);
//		不初始化默认值0,false,以及null
		System.out.println(c);
	}
	
	
	public static void addChar(StringBuffer strBuf){
		strBuf.append("kkkkkkkk");
	}
	
	public static void swap(String a,String b){
		String temp = a;
		a = b;
		b = temp;
		b = b.substring(2);
		
	}

}
