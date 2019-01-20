
public class KeyWordStrictfp {
	
	public static void main(String[] args){
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);	
		}
		System.out.println(2.1-1.2);
		char a = 'A';
		char b = 65;
		System.out.println(a);
		System.out.println(b);
		boolean 中文变量名 = false;
		System.out.println(中文变量名);
		boolean g = Character.isJavaIdentifierPart(';');
		boolean f = Character.isJavaIdentifierPart(50);
		System.out.println(g);
		System.out.println(f);
		byte c = (byte)300;
		//超出范围，c的值为44
		System.out.println(c);
		int i =7;
		int j = 2*i++;
		//j的值为14，i为8
		System.out.println(j);
		System.out.println(i);
		//m的值为16,n为8
		int n = 7;
		int m = 2*++n;
		System.out.println(m);
		System.out.println(n);
		
		String d = null;
		if(d != null && d.equals("")){
			
		}
	}
	/**
	 * strictfp
	 * StrictMath
	 * double>flaot>long>int
	 * +=
	 * -=
	 * &&短路,&非短路
	 */
	public static strictfp void calculation(){
		
	}

}
