
public class Binary {
	public static void main(String[] args){
//		二进制数0B或者0b开头
		System.out.println("二进制:" + Integer.toBinaryString(0B10010));
//		8进制数据0开头，转成二进制字符串输出
		System.out.println("二进制:" + Integer.toBinaryString(010));
		System.out.println("二进制:" + Integer.toBinaryString(8));
//		16进制数,0X或者0x开头转成二进制字符串输出
		System.out.println("二进制:" + Integer.toBinaryString(0x100));
		System.out.println("\u4E2D");
		System.out.println("\u0061");
		char a = '中';
		char b = 'a';
//		一个字符在unicode中的值
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
//		整数默认int类型
//		小数默认double类型
		float e = (float)3.24;
		int f = 0b10101010100001;
		System.out.println(f);
//		用下滑线区使容易看出位数，整形和浮点型均可
		int g = 123_456_789;
        

	}

}
