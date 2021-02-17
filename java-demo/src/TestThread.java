
public class TestThread {
	public static void main(String[] args){
		Runnable r = ()->{
			for(int i=0;i<10000;i++){
				System.out.println("++++++++"+i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10000;i++){
			System.out.println("---------"+i);
			System.out.println(t.getState());
		}
	}

	
}
