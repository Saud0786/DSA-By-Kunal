
import java.util.ArrayList;
import java.util.Arrays;

public class recursion_backtracking {
  public static void main(String[] args) {
    // Question -1
  // maze path count 3*3 matrix maze
  //System.out.println( count(3, 3));

  // question -2
 // maze path print 3*3 matrix maze
 //  path("", 3, 3);
  
    // question -3
 // maze path print in list 3*3 matrix maze 
//   System.out.println(  pathRet("", 3, 3));
   
   // question -3
 // maze path print dialogonal horizontal and virtical in list 3*3 matrix maze 
   //System.out.println(  pathRetDaigonal("", 3, 3));

// Question-4
// print path in maze with restrication

  //  boolean board[][] ={
  //   {true,true,true},
  //   {true,false,true},
  //   {true,true,true}
  //  };
  //  pathWithRestrication("", board, 0, 0);


  // question -5
  // print all the path up and down or left and right
  // boolean board[][] ={
  //   {true,true,true},
  //   {true,true,true},
  //   {true,true,true}
  //  };

  // pathWithAllDirection("", board, 0, 0);




  //Qestion -6
  // count step and store in matrix
 // print all the path up and down or left and right
  boolean board[][] ={
    {true,true,true},
    {true,true,true},
    {true,true,true}
   };
   int path[][]=new int[board.length][board[0].length];

  // pathWithAllDirection("", board, 0, 0, path, 1);

  }
   // maze path count 3*3 matrix maze
  // static int count(int r,int c){
  //   if(r==1 || c==1){
  //       return 1;
  //   }

  //   int left=count(r-1,c);
  //   int right=count(r,c-1);
  
  //   return left+right;
  // }


  // maze path print 3*3 matrix maze
  // static void path(String p,int r, int c){
  //   if(r==1 && c==1){
  //     System.out.println(p);
  //     return;
  //   }

  //   if(r > 1){
  //     path(p+'D', r-1, c);
  //   }
  //   if(c>1){
  //     path(p+'R', r, c-1);
  //   }
  // }



 // maze path print  in list 3*3 matrix maze 
  // static ArrayList<String>pathRet(String p,int r, int c){
  //   if(r==1 && c==1){
  //     ArrayList<String>list=new ArrayList<>();
  //     list.add(p);
  //     return list;
  //   }
  //   ArrayList<String>list=new ArrayList<>();
  //   if(r > 1){
  //    list.addAll( pathRet(p+'D', r-1, c));
  //   }
  //   if(c>1){
  //     list.addAll(pathRet(p+'R', r, c-1));
  //   }
  //   return list;
  // }




 // maze path print dialogonal horizontal and virtical in list 3*3 matrix maze 
  // static ArrayList<String>pathRetDaigonal(String p,int r, int c){
  //   if(r==1 && c==1){
  //     ArrayList<String>list=new ArrayList<>();
  //     list.add(p);
  //     return list;
  //   }
  //   ArrayList<String>list=new ArrayList<>();
  //   if(r>1 && c>1){
  //     list.addAll(pathRetDaigonal(p+'D',r-1,c-1));
  //   }
  //   if(r > 1){
  //    list.addAll( pathRetDaigonal(p+'V', r-1, c));
  //   }
  //   if(c>1){
  //     list.addAll(pathRetDaigonal(p+'H', r, c-1));
  //   }
  //   return list;
  // }



// print path in maze with restrication
// public static void pathWithRestrication(String p,boolean[][] maze,int r,int c){
//   if(r==maze.length-1 && c==maze[0].length-1){
//     System.out.println(p);
//     return;
//   }
//   if(!maze[r][c]){
//     return;
//   }
//   if(r < maze.length-1){
//     pathWithRestrication(p+'D', maze, r+1, c);
//   }
//   if(c < maze[0].length-1){
//     pathWithRestrication(p+'R', maze, r, c+1);
//   }
// }



// print all the path up and down or left and right
// public static void pathWithAllDirection(String p,boolean[][] maze,int r,int c){
//   if(r==maze.length-1 && c==maze[0].length-1){
//     System.out.println(p);
//     return;
//   }
//   if(!maze[r][c]){
//     return;
//   }
//   // when we visited that index mark as false
//   maze[r][c]=false;

//   if(r < maze.length-1){
//     pathWithAllDirection(p+'D', maze, r+1, c);
//   }
//   if(c < maze[0].length-1){
//     pathWithAllDirection(p+'R', maze, r, c+1);
//   }
//   if(r > 0){
//     pathWithAllDirection(p+'U', maze, r-1, c);
//   }
//   if(c > 0){
//     pathWithAllDirection(p+'L', maze, r, c-1);
//   }
//   //this line is where the funtion will be over
//   // so before the function gets removed, also remove the changes that were made by that function
//   maze[r][c]=true;

// }








 // count step and store in matrix
 // print all the path up and down or left and right
public static void pathWithAllDirection(String p,boolean[][] maze,int r,int c,int[][]path,int step){
  if(r==maze.length-1 && c==maze[0].length-1){
    path[r][c]=step;
    for (int[] arr : path) {
        System.out.println(Arrays.toString(arr));
    }
    System.out.println(p);
    System.out.println();
    return;
  }
  if(!maze[r][c]){
    return;
  }
  // when we visited that index mark as false
  maze[r][c]=false;
  path[r][c]=step;

  if(r < maze.length-1){
    pathWithAllDirection(p+'D', maze, r+1, c,path,step+1);
  }
  if(c < maze[0].length-1){
    pathWithAllDirection(p+'R', maze, r, c+1,path,step+1);
  }
  if(r > 0){
    pathWithAllDirection(p+'U', maze, r-1, c,path,step+1);
  }
  if(c > 0){
    pathWithAllDirection(p+'L', maze, r, c-1,path,step+1);
  }


  //this line is where the funtion will be over
  // so before the function gets removed, also remove the changes that were made by that function
  maze[r][c]=true;
  path[r][c]=0;
}
}
