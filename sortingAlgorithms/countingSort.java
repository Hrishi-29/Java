import java.util.*;
public class countingSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter numbers of an Array: ");
		for (int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Entered Array: "+Arrays.toString(arr));
	}
}