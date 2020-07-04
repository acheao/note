public class KeyWordStrictfp {
	
	public static void main(String[] args){
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);	
		}
//		精度丢失
		System.out.println(2.1-1.2);
		char a = 'A';
		char b = 65;
		System.out.println(a);//		A
		System.out.println(b);//		A
		String 中文字符变量 = "测试中文可以当变量名";
		System.out.println(中文字符变量);
		
//		确定指定的字符是Java标识符中除首字符以外的部分
		boolean g = Character.isJavaIdentifierPart(';');
		boolean f = Character.isJavaIdentifierPart(50);
		System.out.println(g);//false
		System.out.println(f);//true

		byte c = (byte)300;
		System.out.println(c);//c的值为44

		int i =7;
		int j = 2*i++;
		System.out.println(j);//j的值为14
		System.out.println(i);//i的值为8

		int n = 7;
		int m = 2*++n;
		System.out.println(m);//m的值为16
		System.out.println(n);//n的值为8
		
		String d = null;
		if(d != null && d.equals("")){
//			因短路而不会报错
		}
		
		String all = String.join(",", "A", "B", "C", "D", "E");
		System.out.println(all);//A,B,C,D,E

		String hw = "hello word";
		int index = hw.offsetByCodePoints(1, 3);
		System.out.println(index);//4

		int cp = hw.codePointAt(index);
		System.out.println(cp);//111

		char four = hw.charAt(4);
		System.out.println(four);//o

		int[] codePoints =  hw.codePoints().toArray();
		String test = new String(codePoints,0,codePoints.length);
		System.out.println(test);//hello word

		//快，单线程不安全
		StringBuilder str = new StringBuilder();
		str.append("ssss");
		//线程安全
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("11111111");		
	}
	/**
	 * strictfp
	 * StrictMath
	 *              char 
	 *               ﹀ 
	 *   byte>short>int--->----long
	 *               ﹀              ×    ﹀
	 *              float--->---double
	 *              
	 *    long>float    int>double  
	 *            
	 * +=
	 * -=
	 * &&短路并,&非短路并
	 * a+=b+=c等价于a+=(b+=c)
	 * instanceof
	 * String不可变字符串
	 */
	public static strictfp void calculation(){
		
	}
	public static int bigNumber(int a,int b){
		int c = a<b?a:b;
		return c;   
		
	} 

}