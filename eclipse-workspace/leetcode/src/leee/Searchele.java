package leee;

public class Searchele {
	static boolean searchMatrix(int[][] matrix, int target) {
	    int i = 0, j = matrix[0].length - 1;
	  while(i < matrix.length && j >= 0) {
	    if(matrix[i][j] == target)
	      return true;
	    else if(matrix[i][j] > target)
	      j --;
	    else if(matrix[i][j] < target)
	      i ++;
	  }
	  return false;
	}
	public static void main(String[] args) {
	  int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
	  int target=16;
	  boolean ans=searchMatrix(matrix,target);
	  System.out.println(ans);
	}
}	       /* int i = 0, j = matrix[0].length - 1;
	      while(i < matrix.length && j >= 0) {
	        if(matrix[i][j] == target)
	        	return true;
	          ans= 10;{
	        	  break;
	          }
	         
	        else if(matrix[i][j] > target)
	          j --;
	        else if(matrix[i][j] < target)
	          i ++;
	      }
	      return false;*/
	     // ans= 11;
	      //System.out.println("hiii"+ans);
	    





