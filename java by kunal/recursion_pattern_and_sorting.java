
import java.lang.reflect.Array;
import java.util.Arrays;

public class recursion_pattern_and_sorting {
  public static void main(String[] args) {
   // triangle -1
    //triangle1(5,0);

    // triangle - 2
   // triangle2(5, 0);

   // bubble sort
  // int arr[]={4,3,2,1};
  // bubble(arr, arr.length-1, 0);
  // System.out.println(Arrays.toString(arr));


  // selection sort
  int arr[]={7,4,3,2,1};
  selection(arr, arr.length, 0, 0);
  System.out.println(Arrays.toString(arr));
  }

  // triangle -1
//   public static void triangle1(int row,int col){
//     if(row==0){
//       return;
//     }
//    if(col < row){
//     System.out.print("* ");
//     triangle1(row, col+1);
//    }else{
//     System.out.println();
//     triangle1(row-1, 0);
//    }
//   }


 // triangle -2
//  public static void triangle2(int row, int col){
//   if(row==0){
//     return;
//   }
//   if(col<row){
//     triangle2(row, col+1);
//     System.out.print("*");
//   }else{
//     triangle2(row-1, 0);
//     System.out.println();
//   }
//  }

// bubble sort
//  public static void bubble(int[] arr,int row,int col){
//    if(row==0){
//     return;
//    }
//  if(col<row){
//   if(arr[col]>arr[col+1]){
//     //swap
//     int temp=arr[col];
//     arr[col]=arr[col+1];
//     arr[col+1]=temp;
//   }
//   bubble(arr, row, col+1);
//  }else{
//   bubble(arr, row-1, 0);
//  }

// }


// selection sort
public static void selection(int arr[],int row,int col,int max){
  if(row==0){
    return;
  }
  if(col<row){
    if(arr[col]> arr[max]){
      selection(arr, row, col+1, col);
    }
  else{
    selection(arr, row, col+1, max);
  }
}
  else{
  int temp=arr[max];
  arr[max]=arr[row-1];
  arr[row-1]=temp;
  selection(arr, row-1, 0, 0);
}
}
 }
