package SM4;

import java.util.Arrays;

public class TestCopyArrays {
	public static void main(String[]  args){
		int[] a = new int[]{1,1,1,23,2,2434,23};
		System.out.println(Arrays.toString(a));
		a = Arrays.copyOf(a, 2);
		System.out.println(Arrays.toString(a));
		
	} 

}
