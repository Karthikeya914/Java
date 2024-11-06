import java.util.*;

public class arrayofstringsoptimised {
    public static void main(String[]bhvgc){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String [] A = new String[size];
        sc.nextLine();
        for(int i=0;i<size;i++){
            A[i] = sc.nextLine();
        }
        StringBuilder mix = new StringBuilder();
        for(int i=0;i<size;i++){
            mix.append(A[i]);
        }
        String unique = mix.toString().toLowerCase();
        boolean [] presence = new boolean[26];
        for(int i=0;i<unique.length();i++){
            char ch = unique.charAt(i);
            if(ch>='a' && ch<='z' ){
                presence[ch-'a'] = true;
            }
        }
         boolean ispangram = true;
         for(int i=0;i<26;i++){
            if(!presence[i]){
                ispangram = false;
                break;
            }
         }
         if(ispangram){
            System.out.println("yes");
         }

         else{
            System.out.println("no");
         }
    }
}
