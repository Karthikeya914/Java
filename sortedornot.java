import java.util.*;

public class sortedornot {
   static boolean issorted(int[]Arr){
       for(int i=0;i<Arr.length-1;i++)
       {  
           if(Arr[i]>Arr[i+1]){
            return false;
           }
       }
       return true;
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr1[]=new int[size];
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        if(issorted(arr1))
        System.out.println("true");
        else
        System.out.println("false");
        sc.close();
    }
} 
    

