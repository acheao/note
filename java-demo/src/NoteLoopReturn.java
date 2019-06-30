
public class NoteLoopReturn {
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			System.out.println("this is i value---------:"+i);
			for(int j=0;j<10;j++){
				System.out.println("this is j value-------:"+j);
				return;
			}
		}
	}
}
//this is i value---------:0
//this is j value-------:0