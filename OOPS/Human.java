 

public class Human {
   // human details
   String name;
   int age;
   int salary;
   boolean married;
   static long population;

   // constructor
   Human(String name,int age,int salary,boolean married){
       this.name=name;
       this.age=age;
       this.salary=salary;
       this.married=married;
       Human.population +=1;
   }
}