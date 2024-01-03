package Sorting;

import java.util.Arrays;

public class TestQuickSort {

	public static void main(String[] args) {
		int [] arr= {65,35,26,13,23,12,91};
		System.out.println("Given Array is : ");
		System.out.println(Arrays.toString(arr));
		quicksort(arr,0,arr.length-1);
		System.out.println("Sorted array :");
		System.out.println(Arrays.toString(arr));	
	}

	private static void quicksort(int[] arr, int start, int end) {
		if(start<end) {
			int p=partition(arr,start,end);
			quicksort(arr,start,p-1);
			quicksort(arr,p+1,end);
		}	
	}

	private static int partition(int[] arr, int first, int last) {
		int pivot=first;
		int i=first;
		int j=last;
		while(i<j) {
			while(i<last && arr[i]<=arr[pivot]) {
				i++;
			}
			while(j>pivot && arr[j]>arr[pivot]) {
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[j];
		arr[j]=arr[pivot];
		arr[pivot]=temp;
		return j;
	}

}
