
public class CodePointTest {
	public static void main(String[] args){
		String str1 = "hi𝕆pt";
		String aa = "hi𝕆";
		String oo = "hio";
		System.out.println(str1.length());//4
        System.out.println(str1.codePointCount(0, str1.length()));//3
        System.out.println(oo.length());//3
        System.out.println(oo.codePointCount(0, oo.length()));//3
        
        int length = str1.length();
        for(int j=0;j<length;j++) {
            char charAt = str1.charAt(j);
            System.out.println(Integer.toHexString(charAt));
        }
        int codePointCount = str1.codePointCount(0, length);
        for(int j=0;j<codePointCount;j++) {
            int codePoint = str1.codePointAt(j);
            System.out.println(Integer.toHexString(codePoint)+"=======");
        }
        //偏移字符的索引数，因为辅助字符不止两个字节
        int index = str1.offsetByCodePoints(1, 2);//4
        System.out.println(index);
        int ss0 = str1.codePointAt(0);
        int ss1 = str1.codePointAt(1);
        int ss2 = str1.codePointAt(2);
        int ss4 = str1.codePointAt(4);
        int ss5 = str1.codePointAt(5);
        System.out.println(Integer.toHexString(ss0));
        System.out.println(Integer.toHexString(ss1));
        System.out.println(Integer.toHexString(ss2));
        System.out.println(Integer.toHexString(ss4));
        System.out.println(Integer.toHexString(ss5));
        System.out.println("\u0068");
        System.out.println("\u0069");
        System.out.println("\u1d546");
        System.out.println("\u0070");
        System.out.println("\u0074");
       
	}

}
