import java.util.*;
public class selectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter an elements of array: ");
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Entered Array: "+ Arrays.toString(arr));
		System.out.println("Sorted Array: "+ Arrays.toString(selectionSort(arr)));
	}
	public static int[] selectionSort(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			int larger = i;
			for (int j = i+1; j<arr.length; j++) {
				if (arr[j]>arr[larger]) {
					larger = j;
				}
			}
			int temp = arr[larger];
			arr[larger] = arr[i];
			arr[i] = temp;                                 
		}
		return arr;
	}
}