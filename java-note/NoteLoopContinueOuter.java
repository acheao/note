
public class NoteLoopContinueOuter {
	public static void main(String[] args){
		outer:
		for(int i=0;i<10;i++){
			System.out.println("这是i的值----------："+i);
			for(int j=0;j<10;j++){
				if(j==5){
					continue outer;
				}
				System.out.println("这是j的值："+j);
			}
			
		}
	}

}
