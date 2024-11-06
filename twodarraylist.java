import java.util.*;

public class twodarraylist {
    public static void main(String[]h){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                int val = sc.nextInt();
                temp.add(val);
            }
            list.add(temp);
        }
        System.out.print(list);
        sc.close();
    }
}
