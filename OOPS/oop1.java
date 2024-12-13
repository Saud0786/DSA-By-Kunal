
class Student{
     String name;
      int rollNo;
      float marks;
      
      // we need a way to add the values of the above properties obj to obj
      // parameter constructer is automatically call when obj is made
  
      Student (){
        // this is how you cal a constructor from another constructor
        // internaly : new Student ("ashif",45,89.7f);
        this ("ashif",45,89.7f);
      }

  Student(String name,int rollNo,float marks){

     // this keyword is use of assign value of constructer value to refrence variable
      this.name=name;
      this.rollNo=rollNo;
      this.marks=marks;

      System.out.println(name);
      System.out.println(rollNo);
      System.out.println(marks);
      
  }


}  
public class oop1 {
public static void main(String[] args) {
  // Student s = new Student("saud",23,78.4f);
   Student s1 = new Student("masud",29,100.4f);
  // Student s2 =new Student();
  // System.out.println(s2.name);


  // if we value of one obj then automaticaly change the value of two obj because it reference point is same in heap memory
  // Student one =new Student();
  // Student two= one;
  // one.name ="harish";
  // System.out.println(two.name);


  // final keyword is use for final value it can not change
  // it cann't empty initialized because it is final its you must have to asssign some value
  // final int num=10;
  // num=34;

  
  // if we make obj are final then we can't make new obj by refrence of final obj
  // but we change value on that obj
//  final A s1=new A("hello");
//   s2=new A("fujail");
//   System.out.println(s1.name);

  } 
}

class A{
  final int num=10;
  String name;
  public A(String name){
    this.name=name;
  }
}
