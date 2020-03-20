class MethodClass{
  void defaultMethod(){
    System.out.println("default methods can be called using object reference");
  }
  static void staticMethod(){
    System.out.println("static methods can be called using class name");
  }
  private void privateMethod(){
    System.out.println("private methods cant be called outside class");
  }
  public void publicMethod(){
    System.out.println("public methods can be called anywhere using object reference");
  }
  
}
public class Methods{
  public static void main(String args[]){
    MethodClass mc = new MethodClass();
    mc.defaultMethod();
    MethodClass.staticMethod();
    System.out.println("mc.privateMethod(); private methods cant be called");
    mc.publicMethod();
  }
}
