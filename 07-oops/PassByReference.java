class MethodClass{
  private int i;
  MethodClass(int i){
    this.i = i;
  }
  void change(){
    this.i = 10;
  }
  void show(){
    System.out.println("i : "+i);
  }
}
class ChangeClass{
  void changeByRef(MethodClass mc){
    mc.change();
  }
}
public class PassByReference{

  public static void main(String args[]){
    MethodClass mc = new MethodClass(5);
    ChangeClass cc = new ChangeClass();
    cc.changeByRef(mc);
    mc.show();
  }
}
