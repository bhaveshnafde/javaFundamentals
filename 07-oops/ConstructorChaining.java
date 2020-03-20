class SuperClass{
  SuperClass(){
    this(4);
    System.out.println("Super Class Constructor invoked");
  }
  SuperClass(int a){
    System.out.println("Super Class Parameterized Constructor invoked");
  }
}
class BaseClass extends SuperClass{
  BaseClass(){
    // super(); this is written implicitly
    System.out.println("Base Class Constructor invoked");
  }
}
public class ConstructorChaining{
  public static void main(String args[]){
    BaseClass bc = new BaseClass();
  }
}
/*
Super Class Parameterized Constructor invoked
Super Class Constructor invoked
Base Class Constructor invoked
*/
