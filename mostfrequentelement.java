import java.util.*;
public class mostfrequentelement{
    public static void main(String[]bv){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] A = new int[size];
        for(int i=0;i<size;i++){
            A[i] = sc.nextInt();
        }
        int currentelement = A[0];
        int currentcount = 1;
        int maxelement = A[0];
        int maxcount =1;
        for(int i=1;i<size;i++){
            if(A[i]==currentelement){
                currentcount++;
            }
            else{
                if(currentcount>maxcount){
                    maxcount=currentcount;
                    maxelement=currentelement;
                }
                currentelement=A[i];
                currentcount=1;
            }
        }
        if(currentcount>maxcount){
            maxelement=currentelement;
        }
        System.out.println(maxelement);
        sc.close();
    }
}