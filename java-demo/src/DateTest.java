import java.util.Date;

public class DateTest {
	
	public static void main(String[] args){
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		long time = System.currentTimeMillis();
		Date today = new Date(time);
		System.out.println(today);
		System.out.println(time);
		today.setTime(1548574684641l);
		System.out.println(today);
		
		Date date1 = new Date(10000);
		Date date2 = new Date(20000);
		System.out.println(date1);
		System.out.println(date2);
		boolean flag = date1.before(date2);
		System.out.println(flag);
		boolean flag2 = date1.after(date2);
		System.out.println(flag2);
		int sub = date1.compareTo(date2);
		System.out.println(sub);
		
	}
	
	
	

}
