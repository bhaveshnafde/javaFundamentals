public class Prime{
  public static void main(String args[]){
    int n = 73;
    boolean is_prime = true;

    for(int i = 2 ; i*i < n ; i++){
      if(n % i == 0){
        is_prime = false;
      }
    }
    if(n<2) is_prime = false;
    System.out.print("is it prime ? "+is_prime);

  }
}

/*
is it prime ? true
*/
