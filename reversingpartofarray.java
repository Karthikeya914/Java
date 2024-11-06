import java.util.*;

public class reversingpartofarray{
      static int[] reverse(int[]arr,int k ,int l){
        while(k<l)
        {
            int temp;
            temp=arr[l-1];
            arr[l-1]=arr[k-1];
            arr[k-1]=temp;
            k++;
            l--;
        }
        return arr;
      }
    public static void main(String[]hagf){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int arr1[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr1[i]=sc.nextInt();
        }
        arr1 = reverse(arr1, k, l);
        for(int i=0;i<size;i++)
        {
            System.out.print(arr1[i]);
        }
        sc.close();
    }
}