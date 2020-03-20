public class Fibonacci{
  public static void main(String args[]){
    int n = 10,temp=0;
    int a = 0,b = 1;
    System.out.print(a+" "+b+" ");
    for(int i = 0 ; i < n-2 ; i++){
      System.out.print((a+b)+" ");
      temp=b;
      b=a+b;
      a=temp;
    }
  }
}

/*
0 1 1 2 3 5 8 13 21 34
*/
