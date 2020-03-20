public class SumOfDigit{
  public static void main(String args[]){
    int num = 12345;
    int sum = 0;
    while(num>0){
      sum+=num%10;
      num/=10;
    }
    System.out.println("Sum of digits of number is : "+sum);
  }
}
/*
Sum of digits of number is : 15
*/
