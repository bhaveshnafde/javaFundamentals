import java.util.*;
public class StackDemo{
  public static void main(String bhavesh[]){
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    System.out.println(st);
    System.out.println(st.pop());
    System.out.println(st);
    System.out.println(st.peek());
  }
}
