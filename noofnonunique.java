import java.util.*;

public class noofnonunique {

    public static void main(String[]hgv){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] A = new int[size];
        for(int i=0;i<size;i++){
            A[i] = sc.nextInt();
        }
        int k=0;
        boolean [] iscounted = new boolean [size];
        for(int i=0;i<size;i++){
            int c=0;
            
            for(int j=0;j<size;j++){
                if(iscounted[i]){
                   continue;
                }
                if(i!=j && A[i]==A[j]){
                    c++;
                    iscounted[j] = true;
                }
            }
            if(c!=0){
             k++;
             iscounted[i] = true;
            }
        }
        System.out.println(k);
        sc.close();
    }
}
