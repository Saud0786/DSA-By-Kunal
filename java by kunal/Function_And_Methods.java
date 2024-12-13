import java.util.Arrays;
import java.util.Scanner;


/**
 * Function_And_Methods
 */
public class Function_And_Methods {
  // print sum of two num
  // return type void


  // public static void sum(){
  //   Scanner sc=new Scanner(System.in);
    // System.out.println("Enter num1 : ");
    // int num1=sc.nextInt();
    // System.out.println("Enter num2 : ");
    // int num2=sc.nextInt();
  //   int sum=num1+num2;
  //   System.out.println("Sum of num : "+ sum);
  // }

// print multi of two num and return 
// return type int
// public static int multi(){
//   Scanner sc=new Scanner(System.in);
//   System.out.println("Enter num1 : ");
//   int num1=sc.nextInt();
//   System.out.println("Enter num2 : ");
//   int num2=sc.nextInt();
//   int multi=num1*num2;
//   return multi;
// }


// print animal name 
// return type String
//  public static String animal(){
//   String t="This is tiger";
//   return t;
//  }



// pass value into the parameter
// print sum of three num
// public static int sum(int a,int b,int c){
//   int sum=a+b+c;
//   return sum;
// }


//  Enter name by using argument says good morning name
// public static String greet(String name){
//   String sms="Good morning "+name;
//   return sms;
// }

//change in arr by ref variable it will be change but String will not be change because string is imutable variable
 
// public static void change(int arr[]){
//   arr[0]=19;
// }


// variable length argument
// public static void foo(int ...v){
//   System.out.println(Arrays.toString(v));
// }

// function overloading
// public static void print(int a){
//   System.out.println(a+ " is a digit");

// }
// public static void print(String name){
//   System.out.println(name);
// }




// check prime num or not 
public static boolean prime(int n){
  if(n<=1){
    return false;
  }

  for(int i=2;i<n;i++){
    if(n%i==0)
    return false;
  }
  return true;
}


    // print all the 3 digits armstrong nums
// example of armstrong num = 153,370,371,407.....

// public static boolean isArmstrong(int n){
//   int original=n;
//   int sum=0;
//   while(n>0){
//     int rem=n%10;
//     n=n/10;
//     sum+=rem*rem*rem;
//   }
//   if(sum==original){
//     return true;
//   }
//   return false;

//  }

  public static void main(String[] args) {
    // print sum of two num
    // sum();


    // print multi of two num and return 
    // int ans=multi();
    // System.out.println("multi of num = "+ ans);


    // print animal name 
    // String name=animal();
    // System.out.println(name);


    // print sum of three num
    // Scanner  sc=new Scanner(System.in);
    // System.out.println("Enter num1");
    // int num1=sc.nextInt();
    // System.out.println("Enter num2");
    // int num2=sc.nextInt();
    // System.out.println("Enter num3");
    // int num3=sc.nextInt();
    // int ans=sum(num1, num2, num3);
    // System.out.println("Sum = "+ans);


    //  Enter name by using argument says good morning name
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter your name : ");
    // String name=sc.nextLine();
    // System.out.println(greet(name));

   // create array and change some value by method
  //  int a[]={23,4,57,89};
  //  change(a);
  //  System.out.println(Arrays.toString(a));

                 // scoop block 
  // int a=34;
  // int b=24;
  // String name="Saud";
  // {
  //   //int a=45; // already initialised outside the block in the same method ,hence you cannt initialise it again
  //      a=299;
  //      // but you can reassign the original value with other value
  //      System.out.println(a);
  //      int c=66;
  //      // values initialized in this block ,will remain in the block
  //      name="ashif";
  //      System.out.println(name);
  //    }
  //    System.out.println(name);
  // //  System.out.println(c);
  //  // we cannt acess because it is outside of block
  

  // variable length argument
  // foo(2,4,5,67,8,9,90);


  // function/methods overloading
  // print("Aman");
  // print(3);
  
    // Question-1
   // check num is prime or not
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean falg=prime(n);
    System.out.println(falg);


    // print all the 3 digits armstrong nums
    
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // //check
    // boolean ans=isArmstrong(n);
    // System.out.println(ans);
   //  print
    // for(int i=100;i<1000;i++)
    //   if(isArmstrong(i)){
    //     System.out.print(i+ " ");
    //   }


  }
}