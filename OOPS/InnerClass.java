// in this all obj have same name because of  static keyword
class Test{
  static String name;

   public Test(String name){
     Test.name=name;
   }
 }
public class InnerClass {
  // if we static keyword then not give error
  //    class Test{
  //  static String name;

  //   public Test(String name){
  //     Test.name=name;
  //   }
  // }
  public static void main(String[] args) {
    Test a= new Test("saud");
    Test b= new Test("akash");

  

    System.out.println(a.name);
    System.out.println(b.name);
  }
}
