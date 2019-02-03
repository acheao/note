package TestExtends;

public interface InterfaceA {
	public static void method(){
		System.out.println("A");
	};
	default void methodTest(){
		System.out.println("AAAAAAAAA");
	}

}
