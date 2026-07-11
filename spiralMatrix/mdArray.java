import java.util.*;
public class mdArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two sizes of array: ");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        System.out.println("Enter a elements: ");
        int[][] matrix = new int[size1][size2];
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i=0; i<=n-1; i++) {
            for (int j=0; j<=m-1; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();
        sMatrix(matrix);
    }
    public static void sMatrix(int[][] matrix) {
        int startCol = 0;
        int startRow = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        //loops of spiral matrix
        while (startCol<=endCol && startRow<=endRow) {
            for (int i=startCol; i<=endCol; i++) {
                System.out.print(matrix[startRow][i]);
            }
            for (int j=startRow+1; j<=endRow; j++) {
                System.out.print(matrix[j][endCol]);
            }
            for (int i=endCol-1; i>=startCol; i--) {
                if (startRow==endRow) {
                    break;
                }
                System.out.print(matrix[endRow][i]);
            }
            for (int j=endRow-1; j>=startRow+1; j--) {
                if (startCol==endCol) {
                    break;
                }
                System.out.print(matrix[j][startCol]);
            }

        startCol++;
        startRow++;
        endCol--;
        endRow--;
        }
        System.out.println();
    }
}