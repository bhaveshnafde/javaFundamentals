public class MatrixMultiplication{
  public static void main(String args[]){
    int a[][] = {{1,2,3},
                 {4,5,6},
                 {7,8,9}};

    int b[][] = {{9,8,7},
                 {6,5,4},
                 {3,2,1}};

    int c[][] = new int[a.length][b[0].length];
    int sum = 0;
    for(int i = 0;i < a.length;i++){
      for(int j = 0;j < b[0].length;j++){
        sum = 0;
        for(int k = 0;k < b.length;k++){
          sum += a[i][k] * b[k][j];
        }c[i][j] = sum;
      }
    }

    for(int i = 0;i < c.length;i++){
      for(int j = 0;j < c[0].length;j++){
        System.out.print(c[i][j]+" ");
      }System.out.println();
    }

  }
}
/*
30 24 18
84 69 54
138 114 90
*/
