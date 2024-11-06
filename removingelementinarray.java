import java.util.*;

public class removingelementinarray {
    public static void main(String[]jnhg){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr1[]=new int[size];
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        int k=sc.nextInt();
        int index=0;
        for(int i=0;i<size;i++){
            if(arr[i]!=k){
                arr1[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<index;i++){
            System.out.print(arr1[i]);
        }
        sc.close();
    }
}
