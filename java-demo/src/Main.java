import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<List<Integer>> all = new ArrayList<>();
        while(scan.hasNext()){
            int index = scan.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i<index;i++){
                list.add(scan.nextInt());
            }
            all.add(list);
        }
        List<List<Integer>> res = solution(all);
        for(List<Integer> list : res){
            for(Integer integer : list){
                System.out.println(integer);
            }
        }
    }

    public static List<List<Integer>> solution(List<List<Integer>> all){
        for(int i= 0;i<all.size();i++){
            List<Integer> a = all.get(i);
            Collections.sort(a);
            for(int j = 0;j<a.size();j++){
                if(j+1<a.size()){
                    while (a.get(j) == a.get(j+1)){
                        a.remove(j+1);
                    }
                }
            }
        }
        return all;
    }

}
