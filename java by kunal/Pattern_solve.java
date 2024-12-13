
public class Pattern_solve {
    // QUestion 1
  // public static void pattern1(int n){
  //   for (int i = 1; i <= n; i++) {   //line no
  //     //for col
  //     for (int j = 1; j <= n; j++) {
  //       System.out.print("* ");
  //     }
  //     //after print first row then print new line
  //     System.out.println();
  //   }
  // }



    // QUestion 2
  // public static void pattern2(int n){
  //   for (int row = 1; row <= n; row++) {   //line no
  //     //for col
  //     for (int col = 1; col <= row; col++) {
  //       System.out.print("* ");
  //     }
  //     //after print first row then print new line
  //     System.out.println();
  //   }
  // }
  

      // QUestion 3
  //  public static void pattern3(int n){
  //   for (int row = 1; row <= n; row++) {
  //     for (int col = 1; col <= n-row+1 ; col++) {
  //       System.out.print("* ");
  //     }
  //     System.out.println();
  //   }
  //  }


    //Question 4
    // public static void pattern4(int n){
    //   for (int row = 1; row <= n; row++) {
    //     for (int col = 1; col <=row ; col++) {
    //        System.out.print(col+" ");
    //     }
    //     System.out.println();
    //   }
    //  }

    //Question 5
    // public static void pattern5(int n){
    //   for (int row = 0; row < 2*n; row++) {
    //       int totalcol=row>n ? 2*n-row : row;
    //       for(int col=0;col<totalcol;col++){
    //         System.out.print("* ");
    //       } 
    //       System.out.println();     
    //   }
    // }


    // Question 6
    // public static void pattern6(int n){
    //   for (int row = 1; row <= n; row++) {
    //       // print spaces
    //       for (int j = 1; j <= n - row; j++) {
    //         System.out.print(" ");
    //     }
    //     // print asterisks
    //     for (int k = 1; k <= row; k++) {
    //         System.out.print("*");
    //     }
          
    //       System.out.println();     
    //   }
    // }


    //Question 7
    // public static void pattern7(int n){
    //   for (int row = 1; row <= n; row++) {
    //       // print spaces
    //       for (int j = 1; j <= n-(n-row)-1 ; j++) {
    //         System.out.print(" ");
    //     }
    //     // print asterisks
    //     for (int k = 1; k <= n-row+1 ; k++) {
    //         System.out.print("*");
    //     }
          
    //       System.out.println();     
    //   }
    // }

    

    // Question 8
    // public static void pattern8(int n){
    //   for (int row = 1; row <= n; row++) {
    //     //space
    //     for (int j = 0; j <= n - row; j++) {
    //           System.out.print(" ");
    //        }

    //     // star
    //     for (int i = 1; i <= (2*row)-1; i++) {
    //       System.out.print("*");
    //     }
    //     System.out.println();
    //   }
    // }

    
    //Question 9

    // public static void pattern9(int n){
      // for (int row = 1; row <= n; row++) {
      //   //space
      //   for (int j = 0; j <= n-(n-row)-1; j++) {
      //         System.out.print(" ");
      //      }

      //   // star
      //   for (int i = 1; i <= (2*n+1)-(2*row); i++) {
      //     System.out.print("*");
      //   }
      //   System.out.println();
      // }
    // }

    // Question -10

    // public static void pattern10(int n){
      // for (int row = 1; row <= n; row++) {
      //   //space
      //   for (int j = 0; j <= n - row; j++) {
      //         System.out.print(" ");
      //      }

      //   // star
      //   for (int i = 1; i <= row; i++) {
      //     System.out.print("* ");
      //   }
      //   System.out.println();
      // }
    // }


    //Question 11
    // public static void pattern11(int n){
      // for (int row = 1; row <= n; row++) {
      //   //space
      //   for (int j = 0; j <= n-(n-row)-1; j++) {
      //         System.out.print(" ");
      //      }

      //   // star
      //   for (int i = 1; i <=n-row+1 ; i++) {
      //     System.out.print("* ");
      //   }
      //   System.out.println();
        
      // }
    // }



    //Question 12
    // public static void pattern12(int rows){
    //   for (int i = 0; i < rows; i++) {
    //     // print spaces
    //     for (int j = 0; j < i; j++) {
    //         System.out.print(" ");
    //     }
    //     // print asterisks
    //     for (int k = 0; k < rows - i; k++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    // // print bottom half of diamond
    // for (int i = rows - 2; i >= 0; i--) {
    //     // print spaces
    //     for (int j = 0; j < i; j++) {
    //         System.out.print(" ");
    //     }
    //     // print asterisks
    //     for (int k = 0; k < rows - i; k++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
    // }

    //Question -28
    // public static void pattern28(int n){
    //   for (int row = 1; row <= n; row++) {
    //     //space
    //     for (int j = 0; j <= n - row; j++) {
    //           System.out.print(" ");
    //        }

    //     // star
    //     for (int i = 1; i <= row; i++) {
    //       System.out.print("* ");
    //     }
    //     System.out.println();
    //   }
      

    //   // down
    //   for (int row = 1; row <= n; row++) {
    //     //space
    //     for (int j = 0; j <= n-(n-row)-1; j++) {
    //           System.out.print(" ");
    //        }

    //     // star
    //     for (int i = 1; i <=n-row+1 ; i++) {
    //       System.out.print("* ");
    //     }
    //     System.out.println();
        
    //   }
    // }


     //Question -30
    // public static void pattern30(int n){
    //   for (int row = 1; row <= n; row++) {
    //     // space
    //     for (int j = 1; j <= n-row; j++) {
    //      System.out.print("  "); 
    //     }

    //     for (int col = row; col >=1 ; col--) {
    //       System.out.print(col+" ");
    //     }
    //     for(int col2=2; col2<=row; col2++){
    //       System.out.print(col2+ " ");
    //     }
    //     System.out.println();
    //   }
    // }



     //Question -17
    //  public static void pattern17(int n){
    //   for (int row = 1; row <= n; row++) {
    //    // first half 
    //     // space
    //     for (int space = 1; space <= n-row; space++) {
    //        System.out.print(" ");
    //     }
         
    //     for (int col =row; col >=1; col--) {
    //        System.out.print(col);
    //     }
    //     for (int i = 2; i <= row; i++) {
    //         System.out.print(i);
    //     }
    //     System.out.println();
    //   }

    //             // Print the descending part of the pyramid
    //             for (int i = n - 1; i >= 1; i--) {
    //               // Print spaces before the numbers
    //               for (int j = 1; j <= n - i; j++) {
    //                   System.out.print(" ");
    //               }
      
    //               // Print ascending numbers
    //               for (int j = i; j >= 1; j--) {
    //                   System.out.print(j);
    //               }
      
    //               // Print descending numbers
    //               for (int j = 2; j <= i; j++) {
    //                   System.out.print(j);
    //               }
      
    //               // Move to the next line
    //               System.out.println();
    //   }

      
    //  }

    

    // Question 31
    public static void pattern31(int n){
      int original=n;
       n=2*n;
      for (int row = 1; row <= n-1; row++) {
        for (int col = 1; col <= n-1; col++) {
          int atEveryIndex=original-Math.min( Math.min(row,col),Math.min(n-row,n-col));
          System.out.print(atEveryIndex);
        }
        System.out.println();
      }
    }
  public static void main(String[] args) {
      //  pattern1(5);
      //  pattern2(5);
      //  pattern3(5);
      //  pattern4(5);
      //  pattern5(5);
      //  pattern6(5);
      //  pattern7(5);
      //  pattern8(5);
      //  pattern9(5);
      //  pattern10(5);
      //  pattern11(5);
      //  pattern11(5);
      //  pattern12(5);
      //  pattern28(5);
      //  pattern30(5);
      //  pattern17(5);
    pattern31(5);
    
  }
}
