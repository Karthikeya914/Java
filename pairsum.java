import java.util.*;

public class pairsum {
    public static void main(String[]jhg){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] A = new int[size];
        for(int i=0;i<size;i++){
            A[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int start = 0;
        int end = A.length-1;
        Arrays.sort(A);
        while(start<=end){
            int PairSum = A[start]+A[end];
            if(PairSum>target){
                end--;
            }
            else if(PairSum<target){
                start++;
            }
            else{
                System.out.println("index" + start);
                System.out.println("index" + end);
                break;
            }
        }
        sc.close();
    }
}
