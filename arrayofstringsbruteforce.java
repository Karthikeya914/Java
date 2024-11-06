 import java.util.*;
 public class arrayofstringsbruteforce{
    public static void main(String[]jhbv){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String [] A = new String[size];
        for(int i=0;i<size;i++){
            A[i] = sc.nextLine();
        }
        StringBuilder total = new StringBuilder();
        for(int i=0;i<size;i++){
            total.append(A[i]);
        }
        total.toString();
        System.out.println(total);
        String unique="";
        for(int i=0;i<total.length();i++){
              boolean isunique = true;
            for(int j=i+1;j<total.length();j++){
                if(total.charAt(i)==total.charAt(j)){
                     isunique=false;
                     break;
                }
                
            }
            if(isunique){
                unique+=total.charAt(i);
           }
        }
        for(int i=0;i<unique.length();i++){
            System.out.println(unique.charAt(i));
        }
        if(unique.length()==26){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
 }