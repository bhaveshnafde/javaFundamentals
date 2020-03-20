class Person{
  Person(String name){
    this.name = name;
  }
  protected String name;
  protected void walk(){
    System.out.println(name + " is walking !");
  }
}
class Teacher extends Person{
  Teacher(String name){
    super(name);
  }
  void teach(){
    System.out.println(name + " is Teaching !");
  }
}
class Singer extends Person{
  Singer(String name){
    super(name);
  }
  void sing(){
    System.out.println(name + " is Singing !");
  }
  protected void walk(){
    super.walk();//referencing to superclass method
    System.out.println(name + " is walking and singing !"); //method overriding
  }
}
public class Inheritance{
  public static void main(String ars[]){
    Teacher t = new Teacher("Mr. Ram");
    t.walk();
    t.teach();
    Singer s = new Singer("Sonu Nigam");
    s.walk();
    s.sing();
    Person ps = new Singer("Post Malone");
    ps.walk();
  }
}


/*
Mr. Ram is walking !

Mr. Ram is Teaching !
Sonu Nigam is walking !
Sonu Nigam is walking and singing !
Sonu Nigam is Singing !
Post Malone is walking !
Post Malone is walking and singing !
*/``
