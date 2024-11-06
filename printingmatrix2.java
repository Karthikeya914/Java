import java.util.Scanner;

public class printingmatrix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int [][] matrix=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=rows-1;i>=0;i--){
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
