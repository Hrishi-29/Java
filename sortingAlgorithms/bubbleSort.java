import java.util.*;
public class bubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter an element of array: ");
		for (int i= 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Entered elements: "+ Arrays.toString(arr));
		System.out.println("In Descending Order: "+ Arrays.toString(bubbleSorting(arr)));
	}
	public static int[] bubbleSorting(int arr[]) {
		boolean swapped = false;
		for (int i = 0; i<arr.length; i++) {
			for (int j=0; j<arr.length-1; j++) {
				if (arr[i]<arr[j+1]) {
					int temp = arr[i];
					arr[i] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				return arr;
			}
		}
	}
}