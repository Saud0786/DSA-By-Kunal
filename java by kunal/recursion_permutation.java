
import java.util.ArrayList;

public class recursion_permutation {
  public static void main(String[] args) {
    //Question -1
    // all permutaion print
    //  String str="abc";
    // permutation("", str);

    //Question -2
    // all permutaion return then print
    // ArrayList<String>ans=permutations("", "abc");
    // System.out.println(ans);

    //Question -3
    // all permutaion count
   // System.out.println(permutationsCount("", "abcd"));

  }
  public static void permutation(String processed,String unProcessed ){
    if(unProcessed.isEmpty()){
      System.out.println(processed);
      return;
    }
   
    char ch=unProcessed.charAt(0);
    for (int i = 0; i <= processed.length(); i++) {
      String first=processed.substring(0, i);
      String second=processed.substring(i,processed.length());
      permutation(first+ch+second, unProcessed.substring(1));
    }

  }


  // public static ArrayList<String> permutations(String processed,String unProcessed ){

  //   if(unProcessed.isEmpty()){
  //     ArrayList<String>list=new ArrayList<>();
  //     list.add(processed);
  //     return list;
  //   }
  //   char ch=unProcessed.charAt(0);
  //   ArrayList<String>ans=new ArrayList<>();
    
  //   for (int i = 0; i <= processed.length(); i++) {
  //     String first=processed.substring(0, i);
  //     String second=processed.substring(i,processed.length());
  //     ans.addAll(permutations(first+ch+second, unProcessed.substring(1)));
  //   }
  //    return ans;
  // }



  // public static int permutationsCount(String processed,String unProcessed ){

  //   if(unProcessed.isEmpty()){
  //     return 1;
  //   }
  //   char ch=unProcessed.charAt(0);
  //   int count=0;
    
  //   for (int i = 0; i <= processed.length(); i++) {
  //     String first=processed.substring(0, i);
  //     String second=processed.substring(i,processed.length());
  //     count+=permutationsCount(first+ch+second, unProcessed.substring(1));
  //   }
  //    return count;
  // }
  
}
