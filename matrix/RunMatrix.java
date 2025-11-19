import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please Enter a Number: ");
    int matrixValue = scanner.nextInt();
    Matrix matrix1 = new Matrix(matrixValue); 
    matrix1.printMatrix();
    matrix1.populateMatrix();
    matrix1.flipMatrix();	  
  }
}
