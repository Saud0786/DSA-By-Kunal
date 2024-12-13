
import java.util.*;
public class String_and_StringBuilder {
  public static void main(String[] args) {
    // String create
    // name is pointing one value in heap memory
    //String is immutable it can't be change because of secuirty  perpose 
    // we can reassign new value it take new pointer outside the string pool
    // but assign in heap memory
    // String name="saud";
    // String name1="saud";
    // // comparision
    // System.out.println(name==name1); // it will give true because it value and refrence is same pointer

    //create two string with same value but not pointing one value in heap memory
    
    // String a=new String("saud");
    // String b=new String("saud");
    // System.out.println(a==b);      // it will give false refrence pointer are diffrent
    // System.out.println(a.equals(b));    // it will give true because it is inbuilt method in string it check inner value

   // PrintStream 
  //  System.out.println(56); //all value give in string form
  //  System.out.println("Saud");
  //  System.out.println(new int[]{2,3,5,6});  // it not print real value
  //  System.out.println(Arrays.toString(new int[]{2,3,5,6}));  // it give real value

      // Pretty Printing in java
      // float a=34.2268f;
      // System.out.printf("Formatted number is %.2f",a); // it print round fix num after point 2 digit
      // System.out.printf("Pie: %.3f",Math.PI);
      // System.out.println();
      // System.out.printf("Hello my name is %s and I am %s","saud","cool");
      // and more knowledge about % search on google format specifiers in string in java

     //opration on string
    //  System.out.println("a"+"b");
    //  System.out.println("saud"+1);
     // this is same as after a few steps: "a"+1;
     //integer will be converted to integer that will call toString()

    //  System.out.println("kunal"+new ArrayList<>());
    //  System.out.println("Kunal"+new Integer(56));
    //  System.out.println(new Integer(34)+""+new ArrayList<>());   
     // if you add two complex data type like integer and arraysList it will give an error but we use string between both data type it will work properly
    

    //performence 
  //  String series="";
  //  for (int i = 0; i < 26; i++) {
  //   char ch=(char)('a'+i);
  //   series+=ch;
  //  }
   //System.out.println(series);  // there is a problem in this type of opration because it create new obj again and again so wastege of memory
   //for solve this problem use StringBuilder

  // StringBuilder this is muitable
  // StringBuilder sb=new StringBuilder();
  // for (int i = 0; i < 26; i++) {
  //   char ch=(char)('a'+i);
  //   sb.append(ch+" ");
  //  }
  //  System.out.println(sb.toString());


  // check palimdrome string or not
   String s="sauduasf";
  System.out.println(isPalindrome(s));
  }
  public static boolean isPalindrome(String str){
     str=str.toLowerCase();
     for (int i = 0; i < str.length()/2; i++) {
      char start=str.charAt(i);
      char end=str.charAt(str.length()-i-1); 
      if(start!=end){
        return false;
      }
     }
     return true;
  }
}
