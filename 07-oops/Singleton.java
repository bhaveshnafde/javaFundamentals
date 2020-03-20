// this is the classic implementation but this is not thread safe as two threads executing parallely can make two objects
class Singleton{
  private Singleton(){}
  private static Singleton obj;
  public static Singleton getInstance(){
    if(obj == null){
      obj = new Singleton;
    }
    return obj;
  }
}
