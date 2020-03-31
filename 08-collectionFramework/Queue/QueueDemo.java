import  java.util.*;
public class QueueDemo{
  public static void main(String bhavesh[]){
    Queue<Integer> que = new LinkedList<>();
    // Methods Throwing exception
    try{
      que.add(1);
      que.add(2);
      que.add(3);
      System.out.println(que);

      System.out.println(que.remove());
      System.out.println(que.remove());
      System.out.println(que.remove());
      System.out.println(que.remove());
    }catch(Exception e){
      System.out.println("Queue Exception");
    }
    //methods not throwing Exception
    Queue<Integer> q = new LinkedList<>();
    q.offer(1);
    q.offer(2);
    q.offer(3);
    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q.poll());
    System.out.println(q.poll());
    System.out.println(q.poll());
  }
}
/*
[1, 2, 3]
1
2
3
Queue Exception
[1, 2, 3]
1
2
3
null
*/
