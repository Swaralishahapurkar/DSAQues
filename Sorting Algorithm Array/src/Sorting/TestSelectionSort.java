package Sorting;

import java.util.Arrays;

public class TestSelectionSort {

	public static void main(String[] args) {
		int [] arr= {65,35,26,13,23,12,91};
		System.out.println("Given array is : ");
		System.out.println(Arrays.toString(arr));
		selectionsort(arr);
		System.out.println("sorted array is : ");
		System.out.println(Arrays.toString(arr));
		
	}

	private static void selectionsort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min_id=i;	
		for(int j=i+1;j<n;j++)
		{
			if(arr[j]<arr[min_id])
			{
				min_id=j;
			}
		}
			int temp=arr[i];
			arr[i]=arr[min_id];
			arr[min_id]=arr[i];
		}	
	}

}
