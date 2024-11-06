import java.util.*;

public class arraylists {
    static ArrayList<Integer> fun(ArrayList<Integer> A){
        ArrayList<Integer> name = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++){
            if(A.get(i)<0 && A.get(i) %2 !=0){
                name.add(A.get(i));
            }
        }
        return name;
    }
    public static void main(String[]jhbgv){

    }
}
