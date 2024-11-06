import java.util.*;

public class replace {
    public static void main(String[] njhs) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] A = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        int min = 0;
        int max = 0;
        for (int i = 1; i < size; i++) {
            if (A[min] > A[i]) {
                min = i;
            }
            if (A[max] < A[i]) {
                max = i;
            }
        }
        int temp = A[min];
        A[min] = A[max];
        A[max] = temp;
        for (int i = 0; i < size; i++) {
            System.out.print(A[i]);
        }

    }
}