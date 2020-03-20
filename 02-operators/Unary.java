public class Unary{
  public static void main(String args[]){
    int a = 1;
    int b = 1;
    int c = 1;
    int d = -1;
    boolean e = true;

    System.out.println("a++     : "+(a++));
    System.out.println("a       : "+(a));
    System.out.println("++b     : "+(++b));
    System.out.println("-(1)    : "+(-c));
    System.out.println("+(-1)   : "+(+d));
    System.out.println("!true   :"+(!e));
  }
}

/*
a++     : 1
a       : 2
++b     : 2
-(1)    : -1
+(-1)   : -1
!true   :false
*/
