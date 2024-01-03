package Sorting;

import java.util.Arrays;

public class TestInsertionSort {

	public static void main(String[] args) {
		int [] arr= {65,35,26,13,23,12,91};
		System.out.println("Given array is :");
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("Sorted array is : ");
		System.out.println(Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j= i -1;
			for(; j>=0 && arr[j]>key;j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	}

}
