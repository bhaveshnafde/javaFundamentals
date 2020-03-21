class MyGen<X, Y>{
  X x;
  Y y;
  public MyGen(X x,Y y){
    this.x = x;
    this.y = y;
  }
  public void getDesc(){
    System.out.println(x+" "+y);
  }
}
public class GenericClass{
  public static void main(String bhavesh[]){
    MyGen<String,Integer> m1 = new MyGen("John",20);
    MyGen<Boolean,String> m2 = new MyGen(true,"Shawn");
    m1.getDesc();
    m2.getDesc();
  }
}
