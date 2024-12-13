
import java.util.Arrays;

/**
 * linearSearch
 */
public class linearSearch {
      // Question -1
  // if target found then return idex num or not found then return -1
    // public static int Search(int arr[],int target){
    //   if(arr.length==0){
    //     return-1;
    //   }
    //   for(int i=0;i<arr.length;i++){
    //     int curr=arr[i];
    //     if(target==curr){
    //       return i; 
    //     }
    //   }
    //   return -1;
    // }

    // Question -1
    // if target found then return item or not found then return -1
    // public static int Search(int arr[],int target){
    //   if(arr.length==0){
    //     return-1;
    //   }
    //   for(int i=0;i<arr.length;i++){
    //     int curr=arr[i];
    //     if(target==curr){
    //       return curr; 
    //     }
    //   }
    //   return -1;
    // }
    
    // Question -1
    // if target found then return true or not found then return false
    // public static boolean Search(int arr[],int target){
    //   if(arr.length==0){
    //     return false;
    //   }
    //   for(int i=0;i<arr.length;i++){
    //     int curr=arr[i];
    //     if(target==curr){
    //       return true; 
    //     }
    //   }
    //   return false;
    // }

        // Question -2

        // public static boolean Search(String name,char target){
        //   if(name.length()==0){
        //     return false;
        //   }
        //   for(int i=0;i<name.length();i++){
            
        //     if(target==name.charAt(i)){
        //       return true; 
        //     }
        //   }
        //   return false;
        // }


        // Question -2
        // search element in the String
        // public static int Search(String name,char target){
        //   if(name.length()==0){
        //     return -1;
        //   }
        //   for(int i=0;i<name.length();i++){
            
        //     if(target==name.charAt(i)){
        //       return i; 
        //     }
        //   }
        //   return -1;
        // }

        // Question -2
        // public static boolean Search(String name,char target){
        //   if(name.length()==0){
        //     return false;
        //   }
        //   for(char ele:name.toCharArray()){
        //     if(target==ele){
        //       return true;
        //     }
        //   }
        //   return false;
        // }

        // Question-3
        // range searching
        // public static int Search(int arr[],int target,int start,int end){
        //   if(arr.length==0){
        //     return-1;
        //   }
        //   for(int i=start;i<=end;i++){
        //     int curr=arr[i];
        //     if(target==curr){
        //       return curr; 
        //     }
        //   }
        //   return -1;
        // }

        // Question -4
        // 2D arrays searching
        // public static int[]Search(int[][]arr,int target){
        //   for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //       if(arr[row][col]==target){
        //         return new int[]{row,col};
        //       }
        //     }
        //   }
        //   return new int[]{-1,-1};
        // }

        //max int 2D arrays
        // public static int Search(int[][]arr){
        //   int max=Integer.MIN_VALUE;
        //   for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //       if(arr[row][col]>max){
        //         max=arr[row][col];
        //       }
        //     }
        //   }
        //   return max;
        // }

        // Question -5
        //Leetcode Find Numbers with Even Number of Digits
    //     public static int findNumbers(int[] nums) {
    //       int count=0;
    //       for(int num:nums){
    //           if(even(num)){
    //               count++;
    //           }
    //       }
    //       return count;
    //   }
    //  static boolean even(int num){
    //       int numberOfDigits=digit(num);
    //       return numberOfDigits%2==0;
    //   }
    //  static int digit(int num) {
    //       int count=0;
    //       if (num < 0)
    //           num *= -1;
    //        while(num>0){
    //           count++;
    //           num/=10;
    //        }
    //       return count;
    //   }

    // Question -6
    // digits in num by shortcut
    // public static int digit2(int num){
    //   if(num<0){
    //     num=num*-1;
    //   }
    //   return (int)(Math.log10(num))+1;
    // }

    //Question-7
  // let solve leetcode problem no 1672
  //  static int maximumWealth(int[][] accounts) {
  //      int ans=Integer.MIN_VALUE;
  //     for(int person=0;person<accounts.length;person++){
  //       int sum=0;
  //       for(int account=0;account<accounts[person].length;account++){
  //         sum+=accounts[person][account];
  //       }
  //       if(sum>ans){
  //         ans=sum;
  //       }
  //     }
  //     return ans;
  //   }

  public static void main(String[] args) {

    // Question -1
    // int arr[]={1,2,3,4,5,6};
    // int target=5;
    // int ans=Search(arr, target);
    // System.out.println(ans);
   

    // Question-2
    // String name="Rahul";
    // char str='u';
    // System.out.println(Search(name, str));

    // Question-3
    // range searching
    // int arr[]={1,2,3,4,5,6};
    // int target=5;
    // int ans=Search(arr, target, 2, 5);
    // System.out.println(ans);

    // Question 4
    // 2D Array search
//     int [][]arr={
//       {23,45,1},
//       {9,6,89,95},
//       {34,77,88,99}
//  };
//  int target=89;
//  int []ans=Search(arr, target);
//  System.out.println(Arrays.toString(ans));


// max value in the array

    // int [][]arr={
    //    {23,45,1},
    //    {9,6,89,95},
    //    {34,77,88,99}
    //   };

    //   int ans=Search(arr);
    //   System.out.println(ans);
    // }

    // Question -5
   // LeetCode Find Numbers with Even Number of Digits
  //  int nums[]={12,345,2,6,7896};
  //  int ans=findNumbers( nums);

  //  System.out.println(ans);



    // Question -6
  // digit in num
  // int num=123435;
  // int ans=digit(num);
  // System.out.println(ans);


  //Question-7
  // let solve leetcode problem no 1672
  // int[][] accounts={{1,5},{7,3},{3,5}};
  // int ans=maximumWealth(accounts);
  // System.out.println(ans);

  }
}