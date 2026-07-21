import java.util.*;
public class insertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter Numbers of an array: ");
		for (int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Entered Array: "+Arrays.toString(arr));
		System.out.println("Sorted Array: "+Arrays.toString(insertionSort(arr)));
	}
	public static int[] insertionSort(int arr[]) {
		for (int i = 1; i<arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j>=0 && arr[j]<key) {
				arr[j+1] = arr[j];
				j-=1;
			}
			arr[j+1] = key;
		}
		return arr;
	}
}