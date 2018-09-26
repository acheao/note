
public class HashcodeTest {
	public static void main(String[] args){
		HashcodeTest hashcode = new HashcodeTest();
		System.out.println(hashcode.hashCode());
		HashcodeTest hashcode1 = new HashcodeTest();
		System.out.println(hashcode1.hashCode());
		
		int i = 1;
		if(i==1)
		  	System.out.println("The first System.out.println is execute");
		System.out.println("The second system.out.print is execute");
		int judge = test();
		System.out.println(judge);
	}   
	public static int test(){
		int a = 1;
		if(a == 1)
			return 1;
		System.out.println("------------------");
		return 2;
		
	}
	


}
