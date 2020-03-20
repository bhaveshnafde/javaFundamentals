public class Strings {
	public static void main(String[] args) {
		  String s1 = "Hello world";
      String s2 = new String("Hello world");
      String s3 = "Hello world";
      System.out.println("s1 == s2 : "+(s1==s2));
      System.out.println("s1 == s3 : "+(s1==s3));
      System.out.println("s1.equlas(s2) : "+s1.equals(s2));
      System.out.println("s1.length() : "+s1.length());
      System.out.println("s1.charAt(6) : "+s1.charAt(6));
      System.out.println("s1.substring(6) : "+s1.substring(6));
      System.out.println("s1.substring(2,6) : "+s1.substring(2,6));
      System.out.println("s1.concat(s2) : "+s1.concat(s2));
      System.out.println("s1.indexOf(world) : "+s1.indexOf("world"));
      System.out.println("s1.toUpperCase() : "+s1.toUpperCase());
      System.out.println("s1.conatins(world) : "+s1.contains("world"));
      System.out.println("s1.isEmpty() : "+s1.isEmpty());
      System.out.println("s1.replace(hello,Hello) : "+s1.replace("hello","Hello"));
      String str_arr[] = s1.split(" ");
      System.out.println("s1.split(' ')");
      for(String s : str_arr){
        System.out.print(s+",");
      }
			char cr[] = s1.toCharArray();
			System.out.println();
			System.out.print("s1.toCharArray() : ");
			for(char ch : cr){
				System.out.print(" "+ch);

			}

	}
}

/*
s1 == s2 : false
s1 == s3 : true
s1.equlas(s2) : true
s1.length() : 11
s1.charAt(6) : w
s1.substring(6) : world
s1.substring(2,6) : llo
s1.concat(s2) : Hello worldHello world
s1.indexOf(world) : 6
s1.toUpperCase() : HELLO WORLD
s1.conatins(world) : true
s1.isEmpty() : false
s1.replace(hello,Hello) : Hello world
s1.split(' ')
Hello,world,
*/
