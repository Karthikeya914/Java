import java.util.*;

public class countsubarrays {
    public static void main(String[] jhg) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int size = sc.nextInt();
            int[] A = new int[size];
            for (int i = 0; i < size; i++) {
                A[i] = sc.nextInt();
            }
            int c = 0;
            for (int i = 0; i < size; i++) {
                for (int j = i; j < size; j++) {
                    boolean inorder = true;
                    for (int k = i; k < j; k++) {
                        if (A[k] > A[k + 1]) {
                            inorder = false;
                            break;
                        }
                    }
                    if (inorder) {
                        c++;
                    }
                }

            }
            System.out.println(c);
            t--;
        }
         sc.close();
    }
}