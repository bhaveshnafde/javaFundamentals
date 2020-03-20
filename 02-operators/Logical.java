public class Logical{
  public static void main(String args[]){
    boolean a = true;
    boolean b = !a;
    boolean c = a&&b;
    boolean d = a||b;
    System.out.println(a+"&&"+b+"    : "+c);
    System.out.println(a+"!!"+b+"    : "+d);
  }
}
/*
true&&false    : false
true!!false    : true
/*
