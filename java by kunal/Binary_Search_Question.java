
public class Binary_Search_Question {
     
  // Question -1
  // Find ceiling num 

  // public static int BinarySearchForCeiling(int arr[],int target){
    //    if(target>arr[arr.length-1]){
    //        return -1;
    //    }
    // int start=0;
    // int end=arr.length-1;
    
    // while(start<=end){
    //     int mid=start+(end-start)/2;
    //   if(target<arr[mid]){
    //     end=mid-1;
    //   }
    //   else if(target>arr[mid]){
    //     start=mid+1;
    //   }else{
    //     return mid;
    //   }
    // }
    // return arr[start];
  // }


      // Question -2
      // find floor of a num

  // public static int BinarySearchForFloor(int arr[],int target){
  //   if(target<arr[arr.length-1]){
  //     return -1;
  //     }
  //   int start=0;
  //   int end=arr.length-1;
    
  //   while(start<=end){
  //       int mid=start+(end-start)/2;
  //     if(target<arr[mid]){
  //       end=mid-1;
  //     }
  //     else if(target>arr[mid]){
  //       start=mid+1;
  //     }else{
  //       return mid;
  //     }
  //   }
  //   return arr[end];
  // }


  // Question - 4
//   public static int[] searchRange(int[] nums, int target) {
//     int ans[]={-1,-1};
//     int start=search(nums,target,true);
//     int end=search(nums,target,false);
//     ans[0]=start;
//     ans[1]=end;
//     return ans;
// }
// static int search(int nums[],int target,boolean findIndex){
//      int ans=-1;
//      int start=0;
//      int end=nums.length-1;
//      while(start<=end){
//         int mid=start+(end-start)/2;
//         if(target<nums[mid]){
//             end=mid-1;
//         }
//         else if(target > nums[mid]){
//             start=mid+1;
//         }else{
//             ans=mid;
//             if(findIndex){
//                 end=mid-1;
//             }else{
//                 start=mid+1;
//             }
//         }
//      }
//      return ans;
// }


// Question -5
// target find in infinite array


// static int ans(int[] arr, int target) {
//   // first find the range
//   // first start with a box of size 2
//   int start = 0;
//   int end = 1;

//   // condition for the target to lie in the range
//   while (target > arr[end]) {
//       int temp = end + 1; // this is my new start
//       // double the box value
//       // end = previous end + sizeofbox*2
//       end = end + (end - start + 1) * 2;
//       start = temp;
//   }
//   return binarySearch(arr, target, start, end);

// }
// static int binarySearch(int[] arr, int target, int start, int end) {
//   while(start <= end) {
//       // find the middle element
// //            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//       int mid = start + (end - start) / 2;

//       if (target < arr[mid]) {
//           end = mid - 1;
//       } else if (target > arr[mid]) {
//           start = mid + 1;
//       } else {
//           // ans found
//           return mid;
//       }
//   }
//   return -1;
// }


// question- 6
// public static int peakIndexInMountainArray(int[] arr) {
//   int start = 0;
//   int end = arr.length - 1;

//   while (start < end) {
//       int mid = start + (end - start) / 2;
//       if (arr[mid] > arr[mid+1]) {
//           // you are in dec part of array
//           // this may be the ans, but look at left
//           // this is why end != mid - 1
//           end = mid;
//       } else {
//           // you are in asc part of array
//           start = mid + 1; // because we know that mid+1 element > mid element
//       }
//   }
//   // in the end, start == end and pointing to the largest number because of the 2 checks above
//   // start and end are always trying to find max element in the above 2 checks
//   // hence, when they are pointing to just one element, that is the max one because that is what the checks say
//   // more elaboration: at every point of time for start and end, they have the best possible answer till that time
//   // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
//   return start; // or return end as both are =
// }



// Question - 7

// public static int Search(int[] nums,int target){
//   int pivot = findPivot(nums);

//         // if you did not find a pivot, it means the array is not rotated
//         if (pivot == -1) {
//             // just do normal binary search
//             return binarySearch(nums, target, 0 , nums.length - 1);
//         }

//         // if pivot is found, you have found 2 asc sorted arrays
//         if (nums[pivot] == target) {
//             return pivot;
//         }

//         if (target >= nums[0]) {
//             return binarySearch(nums, target, 0, pivot - 1);
//         }

//         return binarySearch(nums, target, pivot + 1, nums.length - 1);
   

// }

//  public static int binarySearch(int arr[],int target,int start,int end){
   
//      while(start <= end) {
//             // find the middle element
// //            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//             int mid = start + (end - start) / 2;

//             if (target < arr[mid]) {
//                 end = mid - 1;
//             } else if (target > arr[mid]) {
//                 start = mid + 1;
//             } else {
//                 // ans found
//                 return mid;
//             }
//         }
//         return -1;
//   }


// // find pivot
// public static int findPivot(int arr[]){
      
//     int start=0;
//     int end=arr.length-1;
//     while(start<end){
//       int mid=start+(end-start)/2;
      
//       // case - 1
//       if( mid<end  && arr[mid]>arr[mid+1] ){
//         return mid;
//       }


//     //  case - 2
//       if( mid>start   && arr[mid]<arr[mid-1] ){
//         return mid-1;
//       }

//       // case - 3
//       if(arr[mid]<=arr[start]){
//         end=mid-1;
//       }else{
//         start=mid+1;
//       }   

//     }
//     return -1;
    

// }


 // if elements at middle, start, end are equal then just skip the duplicates

// static int findPivotWithDuplicates(int[] arr) {
//   int start = 0;
//   int end = arr.length - 1;
//   while (start <= end) {
//       int mid = start + (end - start) / 2;
//       // 4 cases over here
//       if (mid < end && arr[mid] > arr[mid + 1]) {
//           return mid;
//       }
//       if (mid > start && arr[mid] < arr[mid - 1]) {
//           return mid-1;
//       }

//       // if elements at middle, start, end are equal then just skip the duplicates
//       if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
//           // skip the duplicates
//           // NOTE: what if these elements at start and end were the pivot??
//           // check if start is pivot
//           if (start < end && arr[start] > arr[start + 1]) {
//               return start;
//           }
//           start++;

//           // check whether end is pivot
//           if (end > start && arr[end] < arr[end - 1]) {
//               return end - 1;
//           }
//           end--;
//       }
//       // left side is sorted, so pivot should be in right
//       else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
//           start = mid + 1;
//       } else {
//           end = mid - 1;
//       }
//   }
//   return -1;
// }



       // Question -8

       //count rotation of array

// public static int CountRotation(int arr[]){
//    int count=findPivot(arr);
//    return count+1;
// }
// // find pivot if no duplicate
// public static int findPivot(int arr[]){
      
//   int start=0;
//   int end=arr.length-1;
//   while(start<end){
//     int mid=start+(end-start)/2;
    
//     // case - 1
//     if( mid<end  && arr[mid]>arr[mid+1] ){
//       return mid;
//     }


//   //  case - 2
//     if( mid>start   && arr[mid]<arr[mid-1] ){
//       return mid-1;
//     }

//     // case - 3
//     if(arr[mid]<=arr[start]){
//       end=mid-1;
//     }else{
//       start=mid+1;
//     }


    
    
    

//   }
//   return -1;
  

// }
 // if elements at middle, start, end are equal then just skip the duplicates

// static int findPivotWithDuplicates(int[] arr) {
//   int start = 0;
//   int end = arr.length - 1;
//   while (start <= end) {
//       int mid = start + (end - start) / 2;
//       // 4 cases over here
//       if (mid < end && arr[mid] > arr[mid + 1]) {
//           return mid;
//       }
//       if (mid > start && arr[mid] < arr[mid - 1]) {
//           return mid-1;
//       }

//       // if elements at middle, start, end are equal then just skip the duplicates
//       if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
//           // skip the duplicates
//           // NOTE: what if these elements at start and end were the pivot??
//           // check if start is pivot
//           if (start < end && arr[start] > arr[start + 1]) {
//               return start;
//           }
//           start++;

//           // check whether end is pivot
//           if (end > start && arr[end] < arr[end - 1]) {
//               return end - 1;
//           }
//           end--;
//       }
//       // left side is sorted, so pivot should be in right
//       else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
//           start = mid + 1;
//       } else {
//           end = mid - 1;
//       }
//   }
//   return -1;
// }



// Question-9

// public static int splitArray(int[] nums, int k) {
//       int start=0;
//       int end=0;

//      for (int i = 0; i < nums.length; i++) {
//         start=Math.max(start, nums[i]);  // in the end of the loop this will contain the max item from the arr
//         end +=nums[i];
//      }

//       // Binary search
//       while(start<end){
//         int mid=start+(end-start)/2;
//         // calculate how many pieces you can divide this in with this max sum
//         int sum=0;
//         int pieces=1;

//         for (int num : nums) {
//           if(sum+num >mid){
//             //you cannot add this in this subarray ,make new one
//             // say you add this num in new subarray , then sum= num
//             sum=num;
//             pieces++; 
//           }else{
//             sum+=num;
//           }
//         }

//       if(pieces>k){
//         start=mid+1;
//       }else{
//         end=mid;
//       }

//       }
  
//   return end;  // here start==end
// }

  public static void main(String[] args) {

      // Question -1
    // Find ceiling of a num 
    // ceiling = Smallest element in array greater or equal to target

    // int arr[]={-12,-3,0,12,32,44};
    // int target=13;
    // int ans=BinarySearchForCeiling(arr, target);
    // System.out.println(ans);
    

      // Question -2
      // find floor of a num
      // floor = Greater element in array smallest or equal to target
      // int arr[]={-12,-3,0,12,32,44};
      // int target=-12;
      // int ans=BinarySearchForFloor(arr, target);
      // System.out.println(ans);


      // Question -3
      //LeetCode Problem
      // Find Smallest Letter Greater Than Target
     
      // Question - 4
      // leetcode problem
      // Find First and Last Position of Element in Sorted Array
      
      // int arr[]={2,4,4,4,4,5,5};
      //  int target=4;
      //  int ans[]=searchRange(arr, target);
      //  for (int i = 0; i < ans.length; i++) {
      //   System.out.print(ans[i]+" ");
      //  }
      


      // Question -5
      //  GeeksforGeeks amzon problem
     // find  the position of target in infinite arrays
      // int[] arr = {3, 5, 7, 9, 10, 90,
      //   100, 130, 140, 160, 170};
      //  int target = 10;
      //  System.out.println(ans(arr, target));
      

      //Question -6
      // peak index in a mountain array - leetcode
  //  int arr[]={2,3,4,56,6,5,3,1};
  //  int ans=peakIndexInMountainArray(arr);
  //      System.out.println(ans);


  // Quesstion -7
  // Search in Roated array
      // int arr[]={4,5,6,7,0,1,2};
      // int target=3;
      // System.out.println(CountRotation(arr));
      

      // Question -8
      // count rotation of array
      // int arr[]={4,5,6,7,0,1,2};
      // System.out.println(CountRotation(arr));


      // Question - 9
      // int nums[]={7,2,5,10,8};
      // int m=2;
      // int ans=splitArray(nums,m);
      // System.out.println(ans);
      
  }
}
