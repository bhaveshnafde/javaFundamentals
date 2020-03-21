import java.util.*;
public class ArrayListExample{
  public static void main(String bhavesh[]){
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Orange");
    fruits.add("Apple");
    fruits.add("Grapes");
    ArrayList<String> veggies = new ArrayList<>();
    veggies.add("Potato");
    veggies.add("Tomato");
    veggies.add("Carrot");

    fruits.addAll(veggies);
    System.out.println(fruits);

    System.out.println(fruits.get(1));
    fruits.set(1, "Orange");
    System.out.println(fruits);
    fruits.remove(0);
    System.out.println(fruits);
    fruits.removeAll(veggies);
    System.out.println(fruits);
    veggies.clear();
    System.out.println(veggies);

    System.out.println(veggies.size());

    System.out.println(fruits.contains("Apple"));

    System.out.println(veggies.isEmpty());
    String arr[] = new String[fruits.size()];
    fruits.toArray(arr);

    for(String s : arr){
      System.out.print(s+" ");
    }
  }
}
/*
[Orange, Apple, Grapes, Potato, Tomato, Carrot]
Apple
[Orange, Orange, Grapes, Potato, Tomato, Carrot]
[Orange, Grapes, Potato, Tomato, Carrot]
[Orange, Grapes]
[]
0
false
true
Orange Grapes
*/
