class Cat{
  private String cat_name;
  Cat(String name_of_cat){
    this.cat_name = name_of_cat;
  }
  void heyKitty(){
    System.out.println("meow! my name is : "+cat_name);
  }
}
public class ClassObject{
  public static void main(String args[]){
    Cat joey = new Cat("joey");
    joey.heyKitty();
  }
}
