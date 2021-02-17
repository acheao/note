package testExtends;

public interface InterfaceB {
	public static void method(){
		System.out.println("B");
	}
	
	default void methodTest(){
		System.out.println("BBBBBBBB"); 
	}
 
}
