
public class NoteLoopContinue {
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			
			if(i==5){
				continue;
			}
			System.out.println("这是i的值："+i);
			
		}
	}

}
//这是i的值：0
//这是i的值：1
//这是i的值：2
//这是i的值：3
//这是i的值：4
//这是i的值：6
//这是i的值：7
//这是i的值：8
//这是i的值：9