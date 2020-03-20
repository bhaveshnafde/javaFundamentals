interface student{
  int study_hours = 5;
  void study();
}
interface footballer{
  int play_hours = 3;
  void play();
}
public class MultipleInheritance implements student,footballer{
  String name = "Bhavesh";

  public static void main(String bhavesh[]){
    MultipleInheritance mi = new MultipleInheritance();
    mi.study();
    mi.play();

  }
  public void study(){
    System.out.println(name + " studies for " + study_hours + " hours");
  }

  public void play(){
    System.out.println(name + " plays for " + play_hours + " hours");
  }
}
/*
Bhavesh studies for 5 hours
Bhavesh plays for 3 hours
*/
