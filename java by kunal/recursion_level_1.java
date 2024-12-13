
public class recursion_level_1 {

  // Question -1 
    // print num 1 to n
  // public static void fun(int n){
  //   if(n==1){
  //     System.out.println(1);
  //     return ;
  //   }
  // we can also write  fun(--n)
  //   fun(--n);   // subtract first then pass next num but (n--) first pass the n then subtract
  //   fun(n-1);
  //   System.out.println(n);
  // }



    // Question - 2
    // print num n to 1
  // public static void fun1(int n){
  //   if(n==1){
  //     System.out.println(1);
  //     return ;
  //   }
  //   System.out.println(n);
  //   fun1(n-1);
  // }



  // Question - 3
 // product of n to 1
  // public static int product(int n){
  //   if(n==1){
  //     return 1; 
  //   }
  //  return n*product(n-1);
  // }


  // Question - 4
 // sum of n to 1
  // public static int sum(int n){
  //   if(n==1){
  //     return 1; 
  //   }
  //  return n+sum(n-1);
  // }


  // Question - 5
  // sum of digits
  // public static int sumOfDigit(int n){
  //   if(n==0){
  //     return 0;
  //   }
    
  //   return (n%10)+sumOfDigit(n/10);
   
  // }


  // Question - 6
  // product of digit
  // public static int ProductOfDigit(int n){
  //   if(n==1){
  //     return 1;
  //   }
    
  //   return (n%10)*ProductOfDigit(n/10);
   
  // }
    

  // question - 7
  // reverse the num
  // public static int sum=0;
  // public static void revNum(int n){
  //   if(n==0){
  //    return ;
  //   }
  //   int rem=n%10;
  //   sum = (sum*10)+rem;
  //   revNum(n/10);
    
  // }
  // second method
  // public static int rev2(int n){
  //   int digits=(int)(Math.log10(n))+1;
  //   return helper(n,digits);
  // }
  // public static int helper(int n,int digits){
  //   if(n%10==n){
  //     return n;
  //   }
  //   int rem=n%10;
  //   return  rem*(int)(Math.pow(10, digits-1))+helper(n/10, digits-1);
  // }

  
  
  // Question - 8
  // public static int palindrome(int n){
  //   int digits=(int)(Math.log10(n))+1;
  //   return helper(n,digits);
  // }
  // public static int helper(int n,int digits){
  //   if(n%10==n){
  //     return n;
  //   }
  //   int rem=n%10;
  //   return  rem*(int)(Math.pow(10, digits-1))+helper(n/10, digits-1);
  // }



   // Question - 9
  // count zero in given num
  // public static int count(int n){
  //   return helper(n,0);
  // }
  // public static int helper(int n ,int count){
  //   if(n==0){
  //     return count;
  //   }
  //   int rem=n%10;
  //   if(rem==0){
  //     return helper(n/10, count+1);
  //   }
  //   return helper(n/10, count);
  // }

  

  

  public static void main(String[] args) {
    // Question - 1 
    // print num 1 to n
    //fun(5);


    // Question - 2
    // print num n to 1
    // fun1(5);

    // Question - 3
    // product of n to 1
   // System.out.println(product(5));

   // Question - 4
    // sum of n to 1
   //System.out.println(sum(5));

  // Question - 5
  // sum of digits
  //System.out.println(sumOfDigit(1234));

  // Question - 6
  // product of num
 // System.out.println(ProductOfDigit(1234));


    // question - 7 
  // reverse the num
  // revNum(1234);
  // System.out.println(sum);
  //System.out.println(rev2(1234));
  

  // Question - 8
  // check num is palindrome or not
  // int n=123216;
  // int rev=palindrome(n);
  // if(rev==n){
  //   System.out.println("Num is palindrome");
  // }else{
  //   System.out.println("Num is not palindrome");
  // }
  


   // Question - 9
  // count zero in num
// System.out.println(count(1204050));
  }
}
