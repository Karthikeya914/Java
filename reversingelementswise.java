import java.util.*;
public class reversingelementswise{
    static int[] kreverse(int[]A,int k){
        for(int i=0;i<A.length;i+=k){
            int left=i;
            int right=k+i-1;
            while(left<right){
                int temp=A[left];
                A[left]=A[right];
                A[right]=temp;
                left++;
                right--;
            }
        }
        return A;
    }
    public static void main(String[]jhgfc){
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int k = sc.nextInt();
       int [] arr = new int[size];
       for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
       }
       arr=kreverse(arr, k);
       for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
       }
       sc.close();
    }

}