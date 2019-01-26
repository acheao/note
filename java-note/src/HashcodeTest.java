
public class HashcodeTest {
	public static void main(String[] args){
		/**
		 *Object的equals方法相等，则hashcode相等，
		 *因为Object的equals调用"=="方法
		 *
		 *String重写了equals和hashcode
		 *
		 *hashcode重写后可以通过System.identityHashCode(s);
		 */
		HashcodeTest h = new HashcodeTest();
		System.out.println(h.hashCode());
		HashcodeTest h1 = new HashcodeTest();
		System.out.println(h1.hashCode());
		String s = "dsf";
		s.hashCode();
		s.equals("s");
		Object o = new Object();
		Object o1 = new Object();
		o.equals(o1);
		o.hashCode();
	}   

}
