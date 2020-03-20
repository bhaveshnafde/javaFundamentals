import java.util.Scanner;
public class OneDimension{
  public static void main(String args[]){
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);
    for(int i = 0;i < arr.length;i++){
      arr[i] = sc.nextInt();
      System.out.print(arr[i]+" ");
    }
  }
}
/*
1 2 3 4 5
1 2 3 4 5
*/
