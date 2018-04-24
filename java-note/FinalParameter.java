
public class FinalParameter {
	public static void main(String[] args){
		final int a = 3;
//		不能被赋值
//		a = 8;
		final int c;
		c = 9;
//		不能被赋值
//		c = 10;
		final String str = "测试："+"99";
		final String str2 = "测试："+String.valueOf(99);
		System.out.println(str == "测试：99");
		System.out.println(str2 == "测试：99");
		System.out.println("测试：99" == "测试：99");
	}

}
