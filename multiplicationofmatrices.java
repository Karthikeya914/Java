import java.util.*;

public class multiplicationofmatrices {
    public static void main(String[]kjh){
        Scanner sc = new Scanner(System.in);
        int rowsa = sc.nextInt();
        int columnsa = sc.nextInt();
        int rowsb = sc.nextInt();
        int columnsb = sc.nextInt();

        int [][] A = new int[rowsa][columnsa];
        int [][] B = new int[rowsb][columnsb];
        for(int i=0;i<rowsa;i++){
            for(int j=0;j<columnsa;j++){
                A[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rowsb;i++){
            for(int j=0;j<columnsb;j++){
                B[i][j]=sc.nextInt();
            }
        }
        
        int [][] C = new int[rowsa][columnsb];
        for(int i=0;i<rowsa;i++){
            for(int j=0;j<columnsb;j++){
                C[i][j]=0;
                for(int k=0;k<rowsb;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        for(int i=0;i<rowsa;i++){
            for(int j=0;j<columnsb;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
