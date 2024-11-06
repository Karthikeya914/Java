public class rotatingamatrix {
    void rotation(int[][] A){
         for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                int temp=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
         }
         for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length/2;j++){
                  int temp=A[i][j];
                  A[i][j]=A[i][A.length-1];
                  A[i][A.length-1]=temp;
            }
         }
    }
    void printMatrix(int[][]A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
