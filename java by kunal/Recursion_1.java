
public class Recursion_1 {
  public static void main(String[] args) {

   // BinarySearch by recursion

   int arr[]={2,3,4,5,6,7,8};
   int key=5;
   System.out.println(BinarySearch(arr, 0, arr.length-1, key));

  //print fibonacci num
  // for (int i = 1; i < 11; i++) {
  //   System.out.println(fibNum(i));
  // }
  //System.out.println(fibNum(50));

   

  }



  // BinarySearch by recursion
  public static int BinarySearch(int arr[],int start,int end,int target){

    while(start<=end){
    int mid= (start)+(end-start)/2;
    if(target==arr[mid]){
      return mid;
    }
    if(target>arr[mid]){
     return BinarySearch(arr, start, mid-1, target);
    }else{
     return BinarySearch(arr, mid+1, end, target);
    }
  }
    return -1;
}
  
 
// find fibonacci num by golden ratio

// public static int fibNum(int n){
//   return (int)(Math.pow(((1+ Math.sqrt(5))/2),n)/Math.sqrt(5));
// }


}