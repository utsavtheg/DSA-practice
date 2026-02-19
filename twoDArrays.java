import java.util.*;

// public class twoDArrays {
//   public static void main(String args[]){
//     int matrix[][] = new int[3][3];
//     int n = matrix.length;
//     int m = matrix[0].length;

//     Scanner sc = new Scanner(System.in);
//     for(int i=0;i<n;i++){
//       for(int j=0;j<m;j++){
//         matrix[i][j] = sc.nextInt();
//       }

//     }
//     for(int i=0;i<n;i++){
//       for(int j=0;j<m;j++){
//         System.out.print(matrix[i][j]+" ");
//       }
//       System.out.println();
//     }
//   }

  
// }


//Find key 
// 

//Spiral  print
public class twoDArrays{
  public static void printSpiral(int matrix[][]){
    int startRow = 0;
    int endRow = matrix.length-1;
    int startCol = 0;
    int endCol = matrix[0].length-1;
     
    // top
    for(int j=startCol;j<= endCol;j++){
     System.out.println(matrix[startRow][j]+" ");
    }

    //right
    for(int i=startRow;i<=endRow;i++){
      System.out.println(matrix[i][endCol]);
    }


    //bottom
    for(int j=endCol-1;j>=startCol;j--){
      if(startRow == endRow){
        break;
      }
      System.out.println(matrix[endRow][j]+" ");
    }


    //left
    for(int i =endRow-1;i>=startRow+1;i--){
      if(startCol == endCol){
        break;
        
      }
      System.out.println(matrix[i][startCol]+" ");
    }

    startCol++;
    startRow++;
    endCol--;
    endRow--;
    
  }
  public static void main(String[] args) {
    
  }
}