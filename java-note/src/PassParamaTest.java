
public class PassParamaTest {
	private static String a = "aaaaaaa";
	private static String b = "bbbbbbb";
	private static StringBuffer strBuf = new StringBuffer("ccc");
	private static int c;
	
	public static void main(String[] args){
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
