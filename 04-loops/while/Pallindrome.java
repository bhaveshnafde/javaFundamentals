public class Pallindrome{
  public static void main(String args[]){
    int num = 123454321;
    int n = num;
    int rev = 0;
    while(n>0){
      rev=(rev*10)+(n%10);
      n/=10;


    }
    if(rev == num){
        System.out.println("Given number is a pallindrome.");
    }else{
        System.out.println("Given number is not a pallindrome.");
    }

  }
}
/*
Given number is a pallindrome.
*/
