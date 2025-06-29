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
    int sMatrix(int[][] matrix) {

    }
}