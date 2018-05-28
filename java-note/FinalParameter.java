
public class FinalParameter {
	public static void main(String[] args){
		final int a = 3;
//		≤ªƒ‹±ª∏≥÷µ
//		a = 8;
		final int c;
		c = 9;
//		≤ªƒ‹±ª∏≥÷µ
//		c = 10;
		final String str = "≤‚ ‘£∫"+"99";
		final String str2 = "≤‚ ‘£∫"+String.valueOf(99);
		System.out.println(str == "≤‚ ‘£∫99");
		System.out.println(str2 == "≤‚ ‘£∫99");
		System.out.println("≤‚ ‘£∫99" == "≤‚ ‘£∫99");
		System.out.println(str2.equals("≤‚ ‘£∫99"));
//		true
//		false
//		true
//		true
	}

}
