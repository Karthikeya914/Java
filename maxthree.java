import java.util.*;

public class maxthree {
    public static void main(String[]jnhb){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] A = new int[size];
        for(int i=0;i<size;i++){
            A[i] = sc.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;


        for(int i=0;i<size;i++){
            if(A[i]>max1){
                max1 = A[i];
            }
        }
        for(int i=0;i<size;i++){
            if(A[i]>max2 && A[i]<max1){
                max2 = A[i];
            }
        }

        for(int i=0;i<size;i++){
            if(A[i]>max3 && A[i]<max2){
                max3 = A[i];
            }
        }

        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
    }
}
