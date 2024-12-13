public class main {
  public static void main (String[] args) {
    // box b1=new box(3,5,6);
    // box b2=new box(b1);
    // System.out.println(b2.l+" "+b2.h+" "+b2.w);

    //boxWeight b3=new boxWeight();
    // boxWeight b3=new boxWeight(2,5,4,3);
    // System.out.println(b3.l+" "+b3.h+" "+b3.w+" "+b3.weight);

   // box b4 = new boxWeight(2,4,8,5);
    //System.out.println(b4.w);
    // it can't weight acess
    //System.out.println(b4.weight);

    // there  are many variables in both parent and child classes
    // you are given acess to variable that are in the ref type i.e boxWeight
    // hence you should have acesss to weight variable
    // this also means, that the ones you trying to acess should be initialsed
    // but here , when the obj itself is of type parent class, how will call the constructor of child class
    // this is why error
    // boxWeight b5= new box(1,2,3,4);

    
    // boxPrice box5 =new boxPrice(2,3,2); 
    // System.out.println(box5.cost);

    // multiple inheritance is not support  java  iske badle me interface use krte hai
    // also java not have hybrid inheritance
  }  
}
