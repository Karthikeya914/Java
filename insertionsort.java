import java.util.*;

public class insertionsort {
    static int[] insertionsorting(int[] A){
        for(int i=1;i<A.length;i++){
            int currentelement=A[i];
            int j=i-1;
            while(j>=0 && currentelement<A[j]){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = currentelement;
        }
        return A;
    }
    public static void main(String[]ssss){
         Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
         int [] A = new int[size];
         for(int i=0;i<A.length;i++){
            A[i] = sc.nextInt();
         }
         A=insertionsorting(A);
         for(int i=0;i<A.length;i++){
            System.out.print(A[i]);
         }
         sc.close();
    }
}
