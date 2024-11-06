import java.util.*;
public class primeornot{
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
        public static void main(String[]hg){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          if(isprime(n)){
            System.out.println("yes");
          }
          else{
            System.out.println("no");
          }
          sc.close();
    }
}
