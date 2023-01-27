package Basics;
import java.util.*;

public class SelectionSort {
	void sort(int arr[]) {
		int n = arr.length;

		// One by one move boundary of unsorted sub array
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)	{
				if (arr[j] < arr[min_idx])
					min_idx = j;
			}
			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	// Prints the array
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
	}

		public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements in the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		SelectionSort ob = new SelectionSort();
		ob.sort(arr);
		System.out.println("Sorted array: ");
		ob.printArray(arr);
	}
}
