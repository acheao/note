
public class NoteBreakLoop {
	public static void main(String[] args){
		outer:
		for(int i=0;i<10;i++){
			System.out.println("i的值为："+i);
			for(int j=0;j<10;j++){
				if(j==3){
					break outer;
				}
				System.out.println("j的值为："+j);
			}
		}
	}

}
//i的值为：0
//j的值为：0
//j的值为：1
//j的值为：2