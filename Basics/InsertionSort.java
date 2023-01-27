package Basics;
import java.util.*;

public class InsertionSort {
	void sort(int a[], int n) {
		int i, key, j;
		for(i=1; i<n; i++) {
			key= a[i];
			j=i;
			while(j>0 && a[j-1]>key) {
				a[j]= a[j-1];
				 j= j-1;
			}
		a[j]=key;
		}
	}
	void printarray(int a[]) {
		System.out.println("Sorted array elements are: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	public static void main(String[] args) {
		InsertionSort obj= new InsertionSort();
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter no of elements: ");
		n= sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter Unsorted array elements: ");
		for(int i=0; i<n; i++) {
			a[i]= sc.nextInt();
		}
		obj.sort(a, n);
		obj.printarray(a);
	}
}
