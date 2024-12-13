import java.util.Scanner;

public class practice {
  public static void main(String[] args) {
    String processed="abc";
    int i=0;
    char ch=processed.charAt(0);
   String  first=processed.substring(0,2);
    String second=processed.substring(2,processed.length());
    String ans=first+ch+second;
    System.out.println(ans);
  }
}
