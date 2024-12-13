
public class arraysAssingment {

  // question -1
    //Build Array from Permutation
//   public static int[] buildArray(int[] nums) {
//     int ans[]=new int[nums.length];
//     for(int i=0;i<=nums.length-1;i++){
//          ans[i]=nums[nums[i]];
//     }
//     return ans;
// }

 // Question -2
 //Concatenation of Array

//  public static int[] getConcatenation(int[] nums) {
//   int n=nums.length;
//   int ans[]=new int[2*n];
//   for(int i=0;i<n;i++){
//       ans[i]=nums[i];
//       ans[n+i]=nums[i];
//   }
//   return ans;
// }




//  Question- 3
//Running Sum of 1d Array
   
// public static int[] runningSum(int[] nums) {
//   for(int i=1;i<nums.length;i++){
//       nums[i]+=nums[i-1];
//   }
//   return nums;
// }


// question -4
//Richest Customer Wealth
// public static int maximumWealth(int[][] accounts) {
//   int ans=Integer.MIN_VALUE;
//   for(int []person:accounts){
//       int sum=0;
//       for(int acount:person){
//           sum+=acount;
//       }
//       if(sum>ans){
//           ans=sum;
//       }
//   }
//   return ans;
// }


// Question 5
//Shuffle the Array

// public static int[] shuffle(int[] nums, int n) {
//   int ans[]=new int[nums.length];
//   int  count=0;
//   for(int i=0;i<n;i++){
//       ans[count]=nums[i];
//       ans[count+1]=nums[n+i];
//       count+=2;
//   }
//   return ans;
// }
  public static void main(String[] args) {
    // question -1
    //Build Array from Permutation
    // int arr[]={0,2,1,5,3,4};
    // int ans[]=buildArray(arr);
    // for (int i = 0; i < ans.length; i++) {
    //   System.out.print(ans[i]+" ");
    // }



    // Question -2
 //Concatenation of Array
//  int arr[]={1,2,1};
//  int ans[]=getConcatenation(arr);
//     for (int i = 0; i < ans.length; i++) {
//       System.out.print(ans[i]+" ");
//     }


//    Question- 3
//Running Sum of 1d Array
   
// int arr[]={1,2,3,4};
// int ans[]=runningSum(arr);
//     for (int i = 0; i < ans.length; i++) {
//       System.out.print(ans[i]+" ");
//     }

// question -4
//Richest Customer Wealth
// int arr[][]={{1,2,3},{1,2,3}};
// int ans=maximumWealth(arr);
// System.out.println(ans);


// Question 5
//Shuffle the Array
// int arr[]={2,5,1,3,4,7};
// int n=3;
// int ans[]=shuffle(arr,n);
//     for (int i = 0; i < ans.length; i++) {
//       System.out.print(ans[i]+" ");
//     }
 

// Question 6
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

// Question 7
//https://leetcode.com/problems/number-of-good-pairs/description/

//Question 8
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

//Question 9
//https://leetcode.com/problems/create-target-array-in-the-given-order/description/

//Question 10
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

//Question 11
//https://leetcode.com/problems/count-items-matching-a-rule/description/

//Question 12
//https://leetcode.com/problems/find-the-highest-altitude/description/

//Question 13
//https://leetcode.com/problems/flipping-an-image/description/

//Question 14
//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/

//Question 15
//https://leetcode.com/problems/matrix-diagonal-sum/description/

//Question 16
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

//Question 17
//https://leetcode.com/problems/transpose-matrix/description/



  }

}
