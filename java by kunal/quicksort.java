
import java.util.Arrays;

public class quicksort {
  public static void main(String[] args) {
    int arr[]={23,4,64,22,32,12};
    quicksort(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
  }
  public static void quicksort(int arr[],int low,int high){
     if(low >= high){
      return;
     }

     int start = low;
     int end = high;
     int mid =start + (end -start)/2;
     int pivot = arr[mid];

     while(start <= end){
        // also a reason why if its already sorted it will not swap
        while(arr[start] < pivot){
          start++;
        }
           
        while(arr[end] > pivot){
          end--;
        }
     
       if(start <= end){

        int temp =arr[start];
        arr[start] =arr[end];
        arr[end] =temp;
        start++;
        end--;

       }

       // recursion call for partion part of array after finding 
       //pivot at correct index

       quicksort(arr, low, end);
       quicksort(arr, start, high);

     }
  }
}
