public class Pattern09{
  public static void main(String args[]){
    int n = 5;

    for(int i = 1 ; i <= n ; i++){
      if(i<=2 || i==n){
        for(int j = 1 ; j <= i ; j++){
          System.out.print("* ");
        }
      }else{
        for(int j = 1 ; j <= i ; j++){
          if(j==1 || j==i){
            System.out.print("* ");
          }
          else{
            System.out.print("  ");
          }
        }
      }
      System.out.println();
    }

  }
}

/*
*
* *
*   *
*     *
* * * * *
*/
