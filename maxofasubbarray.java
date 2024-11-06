import java.util.*;

public class maxofasubbarray {
    public static void main(String[] jhgf) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int size = sc.nextInt();
            int[] A = new int[size];
            for (int i = 0; i < size; i++) {
                A[i] = sc.nextInt();
            }
            for (int start = 0; start < size; start++) {
                for (int end = start; end < size; end++) {
                    int max = A[start];
                    for (int k = start; k <= end; k++) {
                        if (max < A[k]) {
                            max = A[k];
                        }
                    }
                    System.out.print(max + " ");
                }
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}
