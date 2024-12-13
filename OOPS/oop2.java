public class oop2 {
public static void main(String[] args) {
  Human saud=new Human("Saud", 10, 10000, false);
  Human masud=new Human("masud", 10, 10000, false);
  Human ashif=new Human("ashif", 10, 10000, false);

  System.out.println(saud.population);
  System.out.println(masud.population);
  System.out.println(ashif.population);
}
// this is not dependent on objects
static void fun(){
  // greeting();   // you can not use this because it requires an instance
  // but the function you are using it in does not depend on instances


  // you cannt access non static stuff without referencing their instances in 
  // a static context

  // hence ,here I am referencing it
  oop2 obj=new oop2();
  obj.greeting();
}

//we know that something which is not static , belongs to an object
void greeting(){
  // we can use the static funtion in non static funtion 
  fun();
  System.out.println("hello");
}

// we can acess non static in non static
void fun2(){
  greeting();
}

}


 