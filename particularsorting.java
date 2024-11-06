import java.util.*;

public class particularsorting {
    static int[] sortedarr(int[]Array,int a){
        int temp;
        for(int i=0;i<a+1;i++){
            for(int j=i+1;j<a+2;j++){
                if(Array[j]<Array[i]){
                    temp=Array[j];
                    Array[j]=Array[i];
                    Array[i]=temp;
                }
            }
        }
        return Array;
    }
    public static void main(String[]ardg){
         Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
         int a=sc.nextInt();
         int arr[]=new int[size];
         for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
         }
         arr=sortedarr(arr ,a);
         for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
         }
         sc.close();
    }
}
