
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class recursion_subset {
  public static void main(String[] args) {

    // question -1
    // ans= bccd   egnor a from string
    //  String s= "baccad";
    //  String ans="";
    //  System.out.println(subset(s, 0, s.length(), ans));
    //  skipA(s);




    // Question -2
    // skip Apple
    // String str="adapplecf";
    // System.out.println(skipA(str));

    // Question - 3
    // skip app but not apple
  //  System.out.println(skipAppNotApple("appleapo"));
      
  
  // question -4
  // print all subset
  //subset("abc", "");
  //method -2
  //System.out.println(subset("abc", ""));


  // Question -5
  // print all subset by iterative
     int arr[]={1,2,2};
    //  List<List<Integer>>ans=subset(arr);
    List<List<Integer>>ans=subsetDup(arr);
     for (List<Integer> list : ans) {
      System.out.println(list);
     }
  }


     // question -1
    // ans= bccd   egnor a from string
    // method -1
  // public static String subset(String s,int start,int end, String ans){
  //   if(start >= end){
  //     return ans;
  //   }
  //   char c=s.charAt(start);
  //   if(c!='a'){
  //     ans+=c;
  //   }
  //   return subset(s, start+1, end, ans);
  // }
 

     // method -2
  // public static void skipA(String str,String ans){
  //   if(str.isEmpty()){
  //     System.out.println(ans);
  //     return;
  //   }
  //   char ch=str.charAt(0);
  //   if(ch=='a'){
  //     skipA(str.substring(1), ans);
  //      }
  //      else{
  //       skipA(str.substring(1), ans+ch);
  //      }
  // }



      // method -3
  // public static String s="";
  // public static void skipA(String str){
  //   if(str.isEmpty()){
  //     System.out.println(s);
  //     return;
  //   }
  //   char ch=str.charAt(0);
  //   if(ch=='a'){
  //     skipA(str.substring(1));
  //      }
  //      else{
  //        s+=ch;
  //       skipA(str.substring(1));
  //      }
  // }



    // Question -2
    // skip Apple
  // public static String skipApple(String str){
  //   if(str.isEmpty()){
  //     return "";
  //   }
    
  //   if(str.startsWith("apple")){
  //    return skipApple(str.substring(5));
  //      }
  //      else{  
  //     return str.charAt(0) + skipApple(str.substring(1));
  //      }
  // }




     // Qestion - 3
    // skip app but not apple
  // public static String skipAppNotApple(String str){
  //   if(str.isEmpty()){
  //     return "";
  //   }
    
  //   if(!str.startsWith("apple") && str.startsWith("app")){
  //    return skipAppNotApple(str.substring(3));
  //      }
  //      else{  
  //     return str.charAt(0) + skipAppNotApple(str.substring(1));
  //      }
  // }


  // Question - 4
  // print all subset String
  // public static void subset(String str,String set){
  //   if(str.isEmpty()){
  //     System.out.println(set);
  //     return;
  //   }

  //   char ch=str.charAt(0);

  //   subset(str.substring(1), set+ch);
  //   subset(str.substring(1), set);
  // }


  
// method -2

  // public static ArrayList<String> subset(String str,String set){
   
  //   if(str.isEmpty()){
  //     ArrayList<String>ans=new ArrayList<>();
  //     ans.add(set);
  //     return ans;
  //   }

  //   char ch=str.charAt(0);

  //   ArrayList<String>left= subset(str.substring(1), set+ch);
  //   ArrayList<String>rigth=subset(str.substring(1), set);
  //   left.addAll(rigth);
  //   return left;
  // }


  // Question -5
  // print all subset by iterative
  // time complexity - O(n * 2^n)
  
  // public static List<List<Integer>>subset(int arr[]){
  //    List<List<Integer>>outerList=new ArrayList<>();

  //    outerList.add(new ArrayList<>());

  //    for (int num : arr) {
  //      int n= outerList.size();
  //      for (int i = 0; i < n; i++) {
  //       List<Integer>inner=new ArrayList<>(outerList.get(i));
  //       inner.add(num);
  //       outerList.add(inner);
  //      }
  //    }
  //    return outerList;

  // }

  public static List<List<Integer>>subsetDup(int arr[]){
    Arrays.sort(arr);
    List<List<Integer>>outerList=new ArrayList<>();

    outerList.add(new ArrayList<>());
    int start =0;
    int end=0;
    
    
    for (int i = 0; i < arr.length; i++) {
      start=0;
      if(i > 0 && arr[i]==arr[i-1] ){
        start =end +1;
      }
      end =outerList.size()-1;
      int n= outerList.size();
      for (int j = start; j < n; j++) {
       List<Integer>inner=new ArrayList<>(outerList.get(j));
       inner.add(arr[i]);
       outerList.add(inner);
      }
    }
    return outerList;

 }

}
