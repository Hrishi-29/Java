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
        for (int i= 0; i<arr.length; i++) {
            for (int j= 0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print(diSum(arr) + " ");
    }
    public static int diSum(int arr[][]) {
        for (int i= 0; i<arr.length; i++) {
            for (int j= 0; j<arr[0].length; j++) {
                if (i==j) {
                    return arr[i][j];
                }
                else {
                    return 0;
                }
            }
        }
        return 0;
    }
}