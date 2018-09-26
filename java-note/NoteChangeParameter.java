
public class NoteChangeParameter {
	public static void main(String[] args){
		test(2,"数组元素1","数组元素2","数组元素3");
	}
	
	public static void test(int a,String ... strings){
		System.out.println("the value is:"+a);
		for(String s : strings){
			System.out.println(s);
		}
	}

}
