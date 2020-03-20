import java.util.Scanner;
public class TwoDimension{
  public static void main(String args[]){
    int arr[][] = new int[3][2]; // 3 1-D arrays of length 2
    Scanner sc = new Scanner(System.in);
    for(int i = 0;i < arr.length;i++){
      for(int j = 0;j < arr[0].length;j++){
        System.out.print("Enter "+(j+1)+"th element of "+(i+1)+"th array : ");
        arr[i][j] = sc.nextInt();
      }
    }
    for(int i = 0;i < arr.length;i++){
      for(int j = 0;j < arr[0].length;j++){
        System.out.print(arr[i][j]+" ");
      }System.out.println();
    }
  }
}
/*
Enter 1th element of 1th array : 1
Enter 2th element of 1th array : 2
Enter 1th element of 2th array : 4
Enter 2th element of 2th array : 5
Enter 1th element of 3th array : 7
Enter 2th element of 3th array : 8
1 2
4 5
7 8
*/
