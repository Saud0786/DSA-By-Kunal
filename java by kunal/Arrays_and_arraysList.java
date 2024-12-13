
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays_and_arraysList
 */
public class Arrays_and_arraysList {
public static void main(String[] args) {
  // create an arrays - type 1
  // int arr[]=new int[5];    // run time memory allocate is called dynamic memory allocation
  // arr[0]=23;
  // arr[1]=34;
  // arr[2]=56;
  // arr[3]=90;
  // arr[4]=98;
  // System.out.println(arr[4]);

  // create an arrays - type 2
  // int arr[]={23,45,66,78,65,67};    // compile time memory allocated is called static memory allocation
  // System.out.println(arr[3]);

  // create an arrays - type 3
  // String name[];
  // name=new String[5];
  // name[0]="saud";
  // name[1]="rahul";
  // name[2]="aman";
  // name[3]="ashif";
  // name[4]="naman";
  // System.out.println(Arrays.toString(name));   // Arrays.toString(name) it is use for print all element in the arrays

  // input array by user
  Scanner sc=new Scanner(System.in);
  int arr[]=new int[5];
  for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
  }
System.out.println(Arrays.toString(arr));

// array is imutable we can change in the arrys
  //  int arr[]={23,45,66,78,65,67};
  //  System.out.println(Arrays.toString(arr));
  //  arr[0]=34;
  //  System.out.println(Arrays.toString(arr));


  // forEach loop use in arrys
  // int arr[]={23,45,66,78,65,67};
  // for (int element : arr) {
  //   System.out.print(element);
  // }
      
   // Array of String already store null before asign value
   // arrays of int already store zero before asign value
   // String or all non primitive sote in heap memory
   // primetive data type store in stack memory
   // new keyword is use for create an obj

  

   // two dymentional arrays 2D
  //  int arr[][]=new int[5][5]; 
  //  int ar[][]={{1,2,3},{4,5,6},{7,8,9}};
  //  for(int row=0;row<ar.length;row++){
  //   for(int col=0;col<ar[row].length;col++){
  //     System.out.print(ar[row][col]+" ");
  //   }
  //   System.out.println();
  //  }

  // take input by user
  // Scanner sc=new Scanner(System.in);
  // int [][]arr=new int[3][3];
  // for(int row=0;row<arr.length;row++){
  //   for(int col=0;col<arr[row].length;col++){
  //     arr[row][col]=sc.nextInt();
  //   }
  // }
  // for(int row=0;row<arr.length;row++){
  //   for(int col=0;col<arr[row].length;col++){
  //     System.out.print(arr[row][col]+" ");
  //   }
  //   System.out.println();
  // }

   // we can also use forEach loop
  //  for (int[] ele : arr) {
  //   System.out.println(Arrays.toString(ele));
  //  }
  // for (int i = 0; i < arr.length; i++) {
  //   System.out.println(Arrays.toString(arr[i]));
  // }
    

  // ArrayList
  // ArrayList<Integer>list=new ArrayList<>();
  // list.add(1);
  // list.add(2);
  // list.add(3);
  // list.add(4);
  // list.add(5);
  // System.out.println(list);
  // list.remove(2);
  // System.out.println(list);
  // System.out.println(list.contains(5));
  // list.addFirst(21);
  // System.out.println(list);
  // System.out.println(list.reversed());
  // list.set(0, 55);
  // System.out.println(list);

  // for (int i = 0; i < list.size(); i++) {
  //   System.out.print(list.get(i)+ " ");
  // }

  // input take by user
  // Scanner sc=new Scanner(System.in);
  // for (int i = 0; i <5; i++) {
  //   list.add(sc.nextInt());
  // }
  // System.out.println(list);

  // multiDimensal arrayList
  // Scanner sc=new Scanner((System.in));
  // ArrayList<ArrayList<Integer>>list=new ArrayList<>();

  //  // initialisation
  //  for (int i = 0; i < 3; i++) {
  //   list.add(new ArrayList<>());
  //  }

   // add element
  //  for(int i=0;i<3;i++){
  //   for(int j=0;j<3;j++){
  //     list.get(i).add(sc.nextInt());
  //   }
  //  }
  //  //print element
  //  System.out.println(list);

  // Swap 
  // int arr[]={1,2,3,4,5};
  // swap(arr,1,4);
  // System.out.println(Arrays.toString(arr));

  // max element
  // int arr[]={54,3,4,32,31,55};
  // int max=0;
  // for (int element : arr) {
  //   if(element>max){
  //     max=element;
  //   }
  // }
  // System.out.println(max);

// revese the array
// int arr[]={54,3,4,32,31,55};
// for(int i=arr.length-1;i>=0;i--){
//   System.out.print(arr[i]+" ");
// }

  }
  // swap fun
  // static void swap(int arr[],int idx1,int idx2){
  //   int temp=arr[idx1];
  //   arr[idx1]=arr[idx2];
  //   arr[idx2]=temp;
  // }
}