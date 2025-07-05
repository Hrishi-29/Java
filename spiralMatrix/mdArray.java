import java.util.*;
public class mdArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two sizes of array: ");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        System.out.println("Enter a elements: ");
        int[][] matrix = new int[size1][size2];
        int arrSize = matrix.length;
        for (int i=0; i<=arrSize-1; i++) {
            for (int j=0; j<=arrSize-1; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();
        System.out.println(sMatrix(matrix));
    }
    public static int sMatrix(int[][] matrix) {
        int startCol = 0;
        int startRow = 0;
        int endCol = matrix.length-1;
        int endRow = matrix[0].length-1;

        //loops of spiral matrix
        while (startCol<=endCol && startRow<=endRow) {
            for (int i=startCol; i<=endCol; i++) {
                System.out.print(matrix[startRow][i]);
            }

        startRow++;
        endCol--;
        endRow--;
        startCol++;
        }
    }
}