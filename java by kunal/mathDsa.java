
import java.util.ArrayList;

public class mathDsa {
  public static void main(String[] args) {
    // prime num
  //   int n=20;
  //  for (int i = 0; i <n ;  i++) {
  //   System.out.println(i+" "+prime(i));
  //  }



  // prime all prime num till n
  // int n=37;
  // boolean []prime=new boolean[n+1];
  // sieve(n, prime);


  


  // find Squar root of num
  // int n=40;
  // int point=3;
  // System.out.printf("%.3f",FindRoot(n,point));



  // find sqrt of num by newton raphson formula
  // time complexity = O((log n)* f(n))
  // formula =  x + n/x
  // System.out.println(NewtonSqrt(50));


  // factor of the num
  // ex = 20 -> 1,2,4,5,10,20
  // int n=20;
  // factor1(n);
  // factor2(n);
  // factor3(n);

 

  // GCD / hCF (greatest common divison) between two num
  //System.out.println(gcd(4,9));  
  // LCM least common factor
 // System.out.println(LCM(4,7));


  }



  // prime num or not
  // time complexity = sqrt of n
//   public static boolean prime(int n){
//     if(n==0 || n==1){
//       return false;
//     }
//     for (int i = 2; i <= Math.sqrt(n); i++) { // changed i to n
//       if(n%i==0){
//          return false;
//       }
//     }
//     return true;
// }





// prime all prime num till n
// time complexity = O(n*log(log n))
// public static void sieve(int n,boolean[]prime){
//     for (int i = 2; i*i <= n; i++) {
//       if(!prime[i]){
//         for (int j = i*2; j <= n; j+=i) {
//           prime[j]=true;
//         }
//       }
//     }
//     for (int i = 2; i <=n ; i++) {
//       if(!prime[i]){
//         System.out.print(i+" ");
//       }
//     }
// }




  // find Squar root of num  by binary search
  // time complexity = O(log n)
// public static double FindRoot(int n,int p){
//   int start=0;
//   int end=n;
//   double root=0.0;
//   while (start<=end) {
//     int mid=(start)+(end-start)/2;
//     int s=(mid*mid);
//     if(s == n){
//        return mid;
//     } 
//     if(s > n){
//       end=mid-1;
//     }else{
//       start=mid+1;
//     }
//   }
//   double increment=0.1;
//   for (int i = 0; i < p; i++) {
//     while (root*root <= n) {
//       root+=increment;
//     }
//     root-=increment;
//     increment/=10;
//   }
//   return root;
// }




// Newton raphson method for find sqrt of num
// find sqrt of num by newton raphson formula
// public static double NewtonSqrt(double n){
//   double x=n;
//   double root;
//   while (true) {
//     root= 0.5 *(x + (n/x));

//     if(Math.abs(root-x) < 0.5){
//       break;
//     }
//     x=root;
//   }
//   return root;
// }

 


 // factor of the num by brout force aproach
 // time complexity = O(n)
// public static void factor1(int n){
//   for (int i = 1; i <= n; i++) {
//     if(n%i == 0){
//       System.out.print(i+ " ");
//     }
//   }
// }


// time complexity = O(sqrt(n))
// public static void factor2(int n){
//   for (int i = 1; i <= Math.sqrt(n); i++) {
//     if(n%i == 0){
//       if(n/i == i){
//         System.out.print(i + " ");
//       }else{
//         System.out.print(i+ " "+ (n/i) + " ");
//       }
     
//     }
//   }
// }
  

// time complexity and space complexity is O(sqrt(n))
// public static void factor3(int n){
//   ArrayList<Integer>list=new ArrayList<>();

//   for (int i = 1; i <= Math.sqrt(n); i++) {
//     if(n%i == 0){
//       if(n/i == i){
//         System.out.print(i + " ");
//       }else{
//         System.out.print(i+ " ");
//         list.add(n/i);
//       }
     
//     }
//   }
//   for (int i = list.size()-1; i >= 0; i--) {
//     System.out.print(list.get(i) + " ");
//   }
// }

  

// gcd / hcf b/w 2 num
public static int gcd(int a, int b){
  if(a==0){
    return b;
  }
  return gcd(b%a, a);
}


// LCM
public static int LCM(int a,int b){
  return a*b/ gcd(a,b);

}


}