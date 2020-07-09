
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
	}
}
