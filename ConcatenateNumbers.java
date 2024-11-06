import java.util.Scanner;

public class ConcatenateNumbers {
public static void main(String[] args) {
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a ");
    a=sc.nextInt();
    System.out.println("enter b ");
    b=sc.nextInt();
    System.out.println("enter c ");
    c=sc.nextInt();
    if(a>b && a>c)
    {
        System.out.println("a is the biggest");
    }
    else if(b>a && b>c){
        System.out.println("b is the biggest");
    }
    else if(c>a && c>b)
    {
        System.out.println("c is the biggest");
    }
    else
    {
        System.out.println("all are equal or any two may be equal");
    }
}
}