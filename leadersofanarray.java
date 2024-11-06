import java.util.*;

public class leadersofanarray {
    public static void main(String[]nbv){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] A = new int[size];
        for(int i=0;i<size;i++){
            A[i] = sc.nextInt();
        }
        int max = A[size-1];
        System.out.print(max+" ");
        for(int i=size-2;i>=0;i--){
              if(A[i]>max){
                System.out.print(A[i]+" ");
                max = A[i];
              }
         }
        }
    }

