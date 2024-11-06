import java.util.*;
public class uniqueelementsarraylist{
   static ArrayList<Integer> unique(int[]A){
    ArrayList<Integer> uniquIntegers = new ArrayList<Integer>();
       for(int i=0;i<A.length;i++){
          boolean isunique=true;
          for(int j=0;j<A.length;j++){
            if(i!=j && A[i]==A[j]){
                isunique=false;
                break;
            }
          }
          if(isunique){
              uniquIntegers.add(A[i]);
          }
       }
       return uniquIntegers;
   }
    public static void main(String[]jh){
          Scanner sc = new Scanner(System.in);
          int size = sc.nextInt();
          int [] Arr = new int[size];
          for(int i=0;i<size;i++){
            Arr[i] = sc.nextInt();
          }
          ArrayList<Integer> result = unique(Arr);
          System.out.println(result);
          sc.close();

    }
}
