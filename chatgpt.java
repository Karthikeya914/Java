import java.util.*;

public class chatgpt {

    // Method to reverse part of the array
    static int[] reverse(int[] arr, int k, int l) {
        while (k < l) {  // Reverse from index k to l (inclusive)
            int temp = arr[k - 1]; // Subtract 1 from k and l to handle 1-based indexing
            arr[k - 1] = arr[l - 1];
            arr[l - 1] = temp;
            k++;
            l--;
        }
        return arr;  // Return the modified array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size of the array
        int size = sc.nextInt();
        
        // Input the range k and l
        int k = sc.nextInt();
        int l = sc.nextInt();
        
        // Create and input elements of the array
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Call the reverse function
        arr = reverse(arr, k, l);
        
        // Print the modified array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();  // Close the scanner
    }
}