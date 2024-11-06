import java.util.*;

public class stringunique {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char uniquechar='d';
        boolean isunique = false;
        for(int i=0;i<s.length();i++){
             isunique=true;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    isunique=false;
                    break;
                }
            }

            if(isunique){
                uniquechar = s.charAt(i);
                isunique=true;
                break;
            }
        }
        if(isunique){
            System.out.println(uniquechar);
        }
        else{
             System.out.println("no");
        }
        
        sc.close();
    }
}
