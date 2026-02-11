import java.util.*;
public class arrayCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of matrix: ");
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        System.out.print("Enter elements: ");
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j<arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
}