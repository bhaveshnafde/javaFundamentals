/* in anagram : length is same & no of each char. is same ex: aab & aba
There are 3 ways to check anagram :
brute : using a visited boolean array
sort : sort both string and check equality
ascii : ascii table
*/
public class Anagram{
  public static void main(String args[]){
    String s1 = "Sil3n.";
    String s2 = "liS.3n";
    int c1[] = new int[256];
    int index;
    boolean isAn = true;
    for(char ch : s1.toCharArray()){
      c1[(int)ch]++;
    }
    for(char ch : s2.toCharArray()){
      c1[(int)ch]--;
    }
    for(int i = 0; i<256; i++){
      if(c1[i]!=0){
        isAn = false;
        break;
      }
    }
    if(isAn){
      System.out.println(s1+" "+s2+" is anagram.");
    }else{
      System.out.println(s1+" "+s2+" is not anagram.");
    }
  }
}
/*
Sil3n. liS.3n is anagram.
*/
