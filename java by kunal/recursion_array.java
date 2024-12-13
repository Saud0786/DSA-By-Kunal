
import java.util.ArrayList;

public class recursion_array {
  public static void main(String[] args) {

     //Question-1
    // check array is sorted or not
    // int arr[]={2,3,5,7,8,89,90};
    // System.out.println(ArrSort(arr, 0,arr.length-1));



    // Question -2
    //linear search
    // int arr[]={34,5,6,7,76,87,9};
    // System.out.println(linearSearch(arr, 7, 0));


    // Question -3 
    // return all target element index in arraylist
    // int arr[]={4,5,6,7,8,4,6,7,4,6};
    // linearSearch(arr, 6, 0);
    // System.out.println(list);

    // second method
    // ArrayList<Integer>list=new ArrayList<>();
    // System.out.println(AllIndex(arr, 6, 0,list));
    
    //third method
   // System.out.println(AllIndex2(arr, 4, 0));


   //   Question -4
   // rotated binarySearch
    int arr[]={5,6,7,8,1,2,3};
    int target=1;
    System.out.println(rotatedBinarySearch(arr,target,0,arr.length-1));

  }

  //Question-1
  // check array is sorted or not
  // public static boolean ArrSort(int arr[],int start,int n){
   
  //   if(n==0){
  //     return true;
  //   }
  //   if(arr[start]<arr[start+1]){
  //     return ArrSort(arr, start+1,n-1);
  //   }
  //   return false;
  // }



  // Question -2
    //linear search
    // public static boolean linearSearch(int arr[],int target,int i){
    //   if(i==arr.length-1){
    //     return false;
    //   }
    //   if(arr[i]==target){
    //     return true;
    //   }
    //   return linearSearch(arr, target, i+1);
    // }



    // Question - 3
    // return arrayList for all target
    // static ArrayList<Integer>list=new ArrayList<>();
    // public static void linearSearch(int arr[],int target,int i){
      // if(i==arr.length){
      //   return ;
      // }
      // if(arr[i]==target){
      //   list.add(i);
      // }
      // linearSearch(arr, target, i+1);
    // }

    // Second method
    // public static ArrayList<Integer> AllIndex(int arr[],int target,int index,ArrayList<Integer>list){
    //   if(index==arr.length){
    //     return list ;
    //   }
    //   if(arr[index]==target){
    //     list.add(index);
    //   }
    //   return AllIndex(arr, target, index+1,list);
    // }

    // third method
    // create list inside the body then return it as an answer

    // public static ArrayList<Integer> AllIndex2(int arr[],int target,int index){
    //   ArrayList<Integer>list=new ArrayList<>();
    //   if(index==arr.length){
    //     return list;
    //   }
    //   if(arr[index]==target){
    //     list.add(index);
    //   }
    //   ArrayList<Integer>aboveans=AllIndex2(arr, target, index+1);
    //   list.addAll(aboveans);
    //   return list;
    // }


    // Rotated binarySearch
    public static int rotatedBinarySearch(int arr[],int target,int start,int end){
    // base condition
    if(start>end){
      return -1;
    }

    // ans found
      int mid=(start)+(end-start)/2;
      if(arr[mid]==target){
        return mid;
      }

      // first half sorted
      if(arr[start] <= arr[mid]){
        if(target>= arr[start] && target <= arr[mid]){
          return rotatedBinarySearch(arr, target,start,mid-1);
        }else{
          return rotatedBinarySearch(arr, target, mid+1, end);
        }
      }

      // second half sorted
     if(target >= arr[mid] && target <= arr[end]){
       return rotatedBinarySearch(arr, target, mid+1, end);
     }else{
       return rotatedBinarySearch(arr, target, start, mid-1);
     }
    }
}
