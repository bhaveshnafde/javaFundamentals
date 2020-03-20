public class Ternary{
  public static void main(String args[]){

    int a =30,b=20,c=50;
    int max = ((a>b)
              ?(a>c)
                  ?a
                  :c
              :(b>c)
                  ?b
                  :c
          );
    System.out.println("max   : "+max);
  }
}

/*
max   : 50
*/
