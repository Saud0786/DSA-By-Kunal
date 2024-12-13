import java.lang.reflect.Array;
import java.util.*;

public class sorting {
  public static void main(String[] args) {
   int arr[]={23,45,6,1,13,41};

   // bubble sort
   // time complexity 
  // worst case =O(n^2);
// best case =O(n);
// Space Complexity=O(1);


   for(int i=0;i<arr.length;i++){
    for (int j = 0; j < arr.length-i-1; j++) {
         if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
         }
    }
   }
   System.out.println(Arrays.toString(arr));



  // selection sort
  // time complexity 
  // worst case=O(n^2)
// Space Complexity=O(1);
  

  // for(int i=0;i<arr.length;i++){
  //   for (int j = i+1; j < arr.length-1; j++) {
  //        if(arr[i]>arr[j]){
  //         int temp=arr[i];
  //         arr[i]=arr[j];
  //         arr[j]=temp;
  //        }
  //   }
  //  }
  //  System.out.println(Arrays.toString(arr));
  

    // insertion sort
    // time complexity
    // best = O(N)
    // worst = O(N^2)

    // int arr[]={23,45,6,1,13,41};
    // for(int i=0;i<arr.length-1;i++){
    //     for (int j = i+1; j >0; j--) {
    //       if(arr[j]>arr[j-1]){
    //         int temp=arr[j];
    //         arr[j]=arr[j-1];
    //         arr[j-1]=temp;
    //       }else{
    //         break;
    //       }
    //     }
    // }
    // for (int i = 0; i < arr.length; i++) {
    //   System.out.print(arr[i]+" ");
    // }



    // cycle sort
    // time complexity
    // worst = O(N);
     
    //  int arr[]={2,5,4,3,1};
    //  int i=0;
    //  while(i<arr.length){
    //    int correct=arr[i]-1;
    //    if(arr[i]!=arr[correct]){
    //     int temp=arr[i];
    //     arr[i]=arr[correct];
    //     arr[correct]=temp;
    //    }else{
    //     i++;
    //    }
    //  }
    //  System.out.println(Arrays.toString(arr));



    // Question -1
    // find missing num
  //  int arr[]={1,3,0,4,2};
  //  int ans=findDisappearedNumbers(arr);
  //  System.out.println(ans);
   
//Question -2
  // find all missing num

  // int arr[]={4,3,2,7,8,2,3,1};
  // List<Integer>ans=findNun(arr);
  // System.out.println(ans);
   

  // Question - 3
  //find the duplicate number
  // int num[]={3,1,3,4,2};
  // int ans=findDuplicate(num);
  // System.out.println(ans);


  // Question -4
  // find all duplicates in array
  // int arr[]={4,3,2,7,8,2,3,1};
  // List<Integer>ans=findDuplicate(arr);
  // System.out.println(ans);

 
  // Question -5
  // set mismatch

    // int arr[]={1,2,2,4};
    // int ans[]=findErrorNums(arr);
    // System.out.println(Arrays.toString(ans));


    //Question -6
    // First missing positive
    // int arr[]={1,2,0};
    // int ans=firstMissingPositive(arr);
    // System.out.println(ans);
  }

  // Question -1 of cyclic
  
// public static int findDisappearedNumbers(int[] nums) {
//   int i = 0;
//   while (i < nums.length) {
//       int correct = nums[i] ;
//       if (nums[i]< nums.length && nums[i] != nums[correct]) {
//           swap(nums, i , correct);
//       } else {
//           i++;
//       }
//   }

// //   // just find missing numbers
  
//   for (int index = 0; index < nums.length; index++) {
//       if (nums[index] != index) {
//           return index;
//       }
//   }

//   return nums.length;
// }
// public static void swap(int[] arr, int first, int second) {
//   int temp = arr[first];
//   arr[first] = arr[second];
//   arr[second] = temp;
// }


  // Question -2 of cyclic
  //  public static List<Integer>findNun(int []nums){
  //        int i=0;
  //        while (i<nums.length) {
  //           int correct=nums[i]-1;
  //           if(nums[i]!=nums[correct]){
  //             int temp=nums[i];
  //             nums[i]=nums[correct];
  //             nums[correct]=temp;
  //           }else{
  //             i++;
  //           }
  //        }
  //        List<Integer>ans=new ArrayList<>();

  //        for (int index = 0; index < nums.length; index++) {
  //           if(nums[index]!=index+1){
  //             ans.add(index+1);
  //           }
  //        }
  //        return ans;
  //  }





  // Question -3 cyclic sort
  // public static int findDuplicate(int arr[]){
  //   int i=0;
  //   while(i<arr.length){
  //     int correct=arr[i]-1;
  //     if(arr[i]!=arr[correct]){
  //       int temp=arr[i];
  //       arr[i]=arr[correct];
  //       arr[correct]=temp;
  //     }else{
  //       i++;
  //     }
  //   }
  //   for (int j = 0; j < arr.length; j++) {
  //       if(arr[j]!=j+1){
  //         return arr[arr.length-1];
  //       }
  //   }
  //   return -1;
  // }




  // Question -4
  // find all duplicates in array
  //  public static List<Integer>findDuplicate(int arr[]){
  //   int i=0;
  //   while(i<arr.length){
  //     int correct=arr[i]-1;
  //     if(arr[i]!=arr[correct]){
  //       int temp=arr[i];
  //       arr[i]=arr[correct];
  //       arr[correct]=temp;
  //     }else{
  //       i++;
  //     }
  //   }
  //   List<Integer>ans=new ArrayList<>();
  //   for (int j = 0; j < arr.length; j++) {
  //       if(arr[j]!=j+1){
  //         ans.add(arr[j]);
  //       }
  //   }
  //   return ans;
  // }

 // question -5
  // set mismatch
  public static int []findErrorNums(int[] arr) {
    int i=0;
    while(i<arr.length){
     int correct=arr[i]-1;
      if(arr[i]!=arr[correct]){
          int temp=arr[i];
          arr[i]=arr[correct];
          arr[correct]=temp;
       }else{
            i++;
         } 
        
     }

    for (int j = 0; j < arr.length; j++) {
        if(arr[j]!=j+1){
       return new int[]{arr[j],j+1};
          }
      }
    return new int[]{-1,-1};
  }

//   public static int firstMissingPositive(int[] arr) {
//     int i=0;
//     while(i<arr.length){
//        int correct=arr[i]-1;
//        if(arr[i]>0 && arr[i]<= arr.length&& arr[i]!=arr[correct]){
//         int temp=arr[i];
//         arr[i]=arr[correct];
//         arr[correct]=temp;
//        }else{
//         i++;
//        }
//     }
//     for (int index = 0; index < arr.length; index++) {
//       if (arr[index] != index + 1) {
//           return index + 1;
//       }
//   }

//   // case 2
//   return arr.length + 1;
// }
}

