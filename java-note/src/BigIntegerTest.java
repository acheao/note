import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class BigIntegerTest {
	public static void main(String[] args){
		BigInteger bI = BigInteger.valueOf(5);
		BigInteger bI1 = BigInteger.valueOf(6);
		BigInteger bI2 = new BigInteger("200");
		bI = bI.add(bI1);
		System.out.println(bI);
		
		BigDecimal bD =BigDecimal.valueOf(1.223333332);
		int a = bI1.compareTo(bI2);
		System.out.println(a);
		boolean[] bl = new boolean[5];
		for(boolean b:bl){
			System.out.println(b);
		}
		int[] c = new int[10];
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]+"-------"+i);
			c[i] = i;
		}
		for(int i:c){
			System.out.println(i);
		}
		System.out.println(Arrays.toString(c));
		
		int[] d = Arrays.copyOf(c, c.length-1);
		for(int i=0;i<d.length;i++){
			
			System.out.println(d[i]+"--------"+i);
		}
	}

}
