
import java.util.*;
public class stringsnn {
    static String toggle(String s){
        char k;
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)>=97){
                  k =  (char)((int)s.charAt(i)-32);
                  k = s.charAt(i);
            }
            else{
                k = (char)((int)s.charAt(i)+32);
                k = s.charAt(i);
            }

        }
        return s;
    }

    public static void main(String[] snj) {
          Scanner sc = new Scanner(System.in);
          String s = sc.nextLine();
          s=toggle(s);
          for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
          }
          sc.close();
    }
}