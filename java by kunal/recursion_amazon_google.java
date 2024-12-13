
import java.util.ArrayList;

/**
 * recursion_amazon_google
 */
public class recursion_amazon_google {

  public static void main(String[] args) {
    // letter conbination in phone number
    // ArrayList<String>ans=pad("", "12");
    // System.out.println(ans);

    // dice combination is equal to target
    ArrayList<String>ans=new ArrayList<>();
    ans=dise("", 4);
    System.out.println(ans);

  }
  // public static ArrayList<String> pad(String p ,String up){
  //   if(up.isEmpty()){
  //     ArrayList<String>list=new ArrayList<>();
  //     list.add(p);
  //     return list;
  //   }
    
  //   ArrayList<String>ans=new ArrayList<>();
  // int digit=up.charAt(0)-'0';
  // for (int i = (digit-1) * 3 ; i < digit * 3; i++) {
  //   char ch= (char)('a'+i);
  //     ans.addAll(pad(p+ch, up.substring(1)));
  // }
  //  return ans;
  // }




  public static ArrayList<String> dise(String p,int target){
  if(target==0){
    ArrayList<String>ans=new ArrayList<>();
    ans.add(p);
    return ans;
  }
  ArrayList<String>list=new ArrayList<>();
  for (int i = 1; i <= 6 && i<=target; i++) {
   list.addAll(dise(p+i, target-i)); 
  }
  return list;
  }
  
}