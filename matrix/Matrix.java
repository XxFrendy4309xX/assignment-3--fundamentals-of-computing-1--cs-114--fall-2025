public class Matrix {
	
  private int size;
  private int[][] matrix;

  public Matrix(int setupSize) { 
    size = setupSize;
    matrix = new int[size][size];
    System.out.println("Size of Matrix Entered is: " + size + " by " + size + "\n");  
  }
	
  private int[][] swap(int x1, int x2, int y1, int y2) { // NOTE: This needs to be done DIFFERENTLY for both odd and even!
		  
    //Odd number logic goes here:		  
    //HOW TO DO LOGIC:
    //x1, y1 = x2 y2
    //default x1 y1 are both set to size
    // x2 y2 are set to i -1 i -1
    //to increase, xNew = x1 + 1, nNew2 = x1 - 1
    //after row is filled (check by size)
    //ynew = y1 -1, yNew2 = y2 + 1
		  
    int tempMatrix[][] = new int[matrix[0].length][matrix.length];
    tempMatrix = matrix;		  
    tempMatrix[x1][y1] = matrix[x2][y2];
    tempMatrix[x2][y2] = matrix[x1][y1];		  
    matrix = tempMatrix;		  
    return matrix;
  }
	
  public void printMatrix() { // Prints the matrix consisting of zeroes. 
    for (int i = size; i > 0; i--) {
      for (int j = size; j > 0; j--) {
        matrix[i - 1][j - 1] = 0;
        System.out.print(matrix[i - 1][j - 1] + " ");
      }
      System.out.print("\n");
    }
    System.out.println(" ");
  }
	
  public void populateMatrix() { //Populates Matrix
    int matrixTemp[][] = new int[size][size];
    for (int i =  size; i > 0; i--) {
      for (int j = size; j > 0; j--) {
        matrixTemp[i - 1][j - 1] = (((size * i) +1) - j);
        System.out.print(matrixTemp[i - 1][j - 1] + " ");
        matrix = matrixTemp;
      }
      System.out.print("\n");
    }
    for (int row = 0;  row < matrix.length; row++) {
      for (int col = 0; col < matrix[0].length; col++) {
        swap(col, row, row, col);
      }
    }	   
    for (int i = size; i > 0; i--) {
      for (int j = size; j > 0; j--) {
        System.out.print(matrix[i - 1][j - 1] + " ");
      }
      System.out.print("\n");
    }
    System.out.println(" ");
  }
	  
  public void flipMatrix() { //Flips the Matrix
    for (int i = size; i > 0; i--) {
      int tempMatrix[][] = matrix;
      for (int j = 0; j < tempMatrix[0].length; j++);  
        matrix = tempMatrix;
        //unfortunetly I ran out of time for this entire assignment.
	//sometimes trying your best still isn't enough...
	//I spend over 10 hours working on this one.	  
    }  
  }
}
