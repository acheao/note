import java.util.StringJoiner;

public class StringTest {
	public static void main(String[] args){
		int[] codePoints = { 0x1d546 };
        String str = new String(codePoints,0,codePoints.length);
        System.out.println(str);
        
        String str0 = "111111";
        String str1 = new String(str0);
        String str2 = str0;
        System.out.println(str0 == str1);
        System.out.println(str0 == str2);
        
        String str3 = "hi𝕆pt";
        str3.codePoints().boxed().forEach(
                integer -> System.out.println(Integer.toHexString(integer)));
        
        int[] ints = {0x68,0x69,0x1d546,0x70,0x74};
        String str4 = new String(ints,1,3);
        System.out.println(str4);
        
        int i1 = str3.indexOf(0x1d546);
        int i2 = str3.indexOf(0x70);
        int s1 = str3.indexOf("𝕆");
        int s2 = str3.indexOf("p");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(s1);
        System.out.println(s2);
        String str5 = "hi𝕆pthi𝕆pt";
        
        int i4 = str5.lastIndexOf(0x1d546,2);
        System.out.println(i4);
        String str6 = "123456789";
        String str7 = str6.substring(4,6);
        System.out.println(str7);
        String str8 = str5.toUpperCase();
        System.out.println(str5);
        System.out.println(str8);
        String str9 = " fdfhhf fdfdf ";
        System.out.println(str9.trim());
        System.out.println(String.join(",","A","B","C","D","E","F"));
        StringJoiner sj = new StringJoiner(":");
        sj.add("Ab");
        sj.add("cd");
        sj.add("ef");
        System.out.println(sj.toString());
        try{
        	if(true){
            	throw new NullPointerException();
            }
        }catch(Exception e){
        	e.printStackTrace();
        }
        
        double[] a = new double[10];
        for(double s : a){
        	System.out.println(s);
        }
        
	}
}
