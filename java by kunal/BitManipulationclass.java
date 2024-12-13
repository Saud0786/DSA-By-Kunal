
public class BitManipulationclass {
  public static void main(String[] args) {
    // Question -1
    // odd and even by bitwise
    // int a=11 ;
    // int b=a&1;
    // if(b==1){
    //  System.out.println("Odd");
    // }else{
    //  System.out.println("Even");
    // }


    // Question -2
    // find single num in array
    // int arr[]={2,3,4,5,5,3,2,4,7};
    // int unique=0;
    // for (int n : arr) {
    //     unique^=n;
    // }
    // System.out.println(unique);


   // Question -3
    // find single num in array
    // int arr[]={-2,3,4,-5,-5,3,-2,4,7};
    // int unique=0;
    // for (int n : arr) {
    //     unique^=n;
    // }
    // System.out.println(unique);



 // Question -4
    // find ith bit of a num
   // ith position ke alawa sb ko zero kr dega
    // int num=10;
    // int n=2;
    // int mask=1<<(n-1);
    // int ans=num&mask;
    //System.out.println(ans);



 // Question -5
   // set the i th bit num
   // 0 -> 1
   // 1 -> 1
  //  int n=5;
  //  int k=2;
  //  int mask=1<<k-1;
  //  int ans=mask | n;
  //  System.out.println(ans);
   


   // Question -6
  // reset the i th bit num
  // 1 -> 0
  // 0 -> 1
  //  int n=9;
  //  int i=4;
  //  int mask= ~(1<<i-1);
  //  int ans=n&mask;
  //  System.out.println(ans);



 // Question -7
 // find the position of the right most bit

  //  int n=10;
  //  int negativeN=~(n)+1;
  //  int ans=n&negativeN;
  //  System.out.println(ans);


 // Question -8
  // find single time appear digit in arr and all digit appear 3 time
  // int arr[]={2,2,3,2,7,7,8,7,8,8};
  // System.out.println(findSingle(arr));


   // Question -9 (Amazon)
   // find nth magic num
  //  int n=7;
  //  int ans=0;
  //  int base=5;
  //  while(n>0){
  //   int last=n&1;
  //    n = n>>1;
  //    ans+=base*last;
  //    base=base*5;

  //  }
  // System.out.println(ans);


  // Question -10
  // find the digit of num
  // approach -1
  // int n=17;
  // int count=0;
  // while(n>0){
  //   n>>=1;
  //   count++;
  // }
  // System.out.println(count);

  //approach -2
  // by using formula
  // int n=16;
  // int base=2;

  // int ans=(int)(Math.log(n)/Math.log(base))+1;
  // System.out.println(ans);

  

  // Qustion -11
  // find sum of nth row of pascals triangle
  // int n=5;
  // System.out.println(1<<(n-1 ));


  // Question -12
  // find out given num is power of 2 or not

  // int n=13;
  // int count=0;
  // while (n>0) {
  //   int last=1&n;
  //   if(last==1){
  //     count++;
  //   }
  //   n>>=1;
    
  // }
  // if(count==1){
  //   System.out.println("Power of 2");
  // }else{
  //   System.out.println(" this num is not power of 2");
  // }

  // by formula
//   int n=32;
//   int res=n&(n-1);
//   if(res==0){
//  System.out.println("power of two ");
//   }else{
//     System.out.println("not power of two");
//   }



// Question -13
// find power of any num A^b
   
  // int power=7;  // 3^7 = 2187
  // int base=3;
  // int ans=1;
  // while(power>0){
  //   int last=1&n;
  //   if(last==1){
  //     ans=ans*base;
  //   }
  //   power=power>>1;
  //   base=base*base;
  // }
  // System.out.println(ans);


  // Question -14
// count set bits
  //  int n=45;
  //  int count=0;
  //  while(n>0){
  //   count++;
  //   n=n&(n-1);
  //  }
  // System.out.println(count);

  // Question -15
  // num convert into binary num
  // int n=34;
  // System.out.println(Integer.toBinaryString(n));
  

  // Question -16
  //Xor of all num between a & b
  int a=3;
  int b=9;
  int ans=Xor(b)^Xor(a-1);
  System.out.println(ans);
  
  }


  // Question -8
  // find single time appear digit in arr and all digit appear 3 time 
//   public static int findSingle(int[] arr) {
//     int ones = 0;
//     int twos = 0;

//     for (int num : arr) {
//         twos |= ones & num;
//         ones ^= num;
//         int threes = ones & twos;
//         ones &= ~threes;
//         twos &= ~threes;
//     }

//     return ones;
// }

// Question -16
  //Xor of all num between a & b
  public static int Xor(int a){
    if(a%4==0){
      return a;
    }
   if( a%4==1){
      return 1;
    }
  if(a% 4==2){
    return a+1;
  }
  return 0;
  }
}
