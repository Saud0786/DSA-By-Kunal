/**
 * Innerpolymorphism
 */
 class shapes {
void area(){
 System.out.println("I am shapes class");
} 
}
class rectangle extends shapes{
  void area(){
    System.out.println("Area of rectangle is l * b");
  }
}
class circle extends shapes{
  void area(){
    System.out.println("Area of circle is pi * r * r");
  }
}
public class polymorphism {
  public static void main(String[] args) {
    // it call main shapes class
    shapes s=new shapes();
    s.area();
     // it call rectangle class
    rectangle r= new rectangle();
    r.area();
     // it call circle class
    circle c= new circle();
    c.area();
    // it call circle class
   shapes s2=new circle();
   s2.area();
  }
}


// type of polymorphism
// compile time/ static polymorphism (Methord overloading)
 // difine : it means function will be same but num of parameter is diff
 // exmple:   int sum(int a,int b){
    //          return a+b;
    //         }
    //            int sum(int a,int b,int c){
              //   return a+b+c;
              //  }



// run time / dynamic polymorphism (Methord overridding)
// define : same fun in parent and child class also then override fun
// example
// class shapes {
//   void area(){
//    System.out.println("I am shapes class");
//   } 
//   }
//   class rectangle extends shapes{
//     void area(){
//       System.out.println("Area of rectangle is l * b");
//     }
//   }
//   class circle extends shapes{
//     void area(){
//       System.out.println("Area of circle is pi * r * r");
//     }
//   }
