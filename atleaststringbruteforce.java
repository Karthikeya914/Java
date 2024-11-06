import java.util.*;

public class atleaststringbruteforce {
    public static void main(String[]hgf){
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
        mix.toString();
        String unique ="";
        for(int i=0;i<mix.length();i++){
            boolean isunique = true;
            for(int j=i+1;j<mix.length();j++){
                if(mix.charAt(i)==mix.charAt(j)){
                    isunique =false;
                    break;
                }
            }
            if(isunique){
                unique+=mix.charAt(i);
            }
        }
        System.out.println(unique.length()==26);
        sc.close();
    }
}