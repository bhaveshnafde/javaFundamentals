public class Assignment{
  public static void main(String args[]){
    int a = 10,b=2;
    System.out.println("a+=b    : "+(a+=b));
    System.out.println("a-=b    : "+(a-=b));
    System.out.println("a*=b    : "+(a*=b));
    System.out.println("a/=b    : "+(a/=b));
    System.out.println("a%=b    : "+(a%=b));
    System.out.println("a=b     : "+(a=b));
  }
}
/*
a+=b    : 12
a-=b    : 10
a*=b    : 20
a/=b    : 10
a%=b    : 0
a=b     : 2
*/
