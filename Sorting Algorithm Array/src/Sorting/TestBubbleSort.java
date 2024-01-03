package Sorting;

import java.util.Arrays;

public class TestBubbleSort {

	public static void main(String[] args) {
		
		int [] arr={65,35,26,13,23,12,91};
		System.out.println("Given array is :");
		System.out.println(Arrays.toString(arr)); //to print array in comma separated values
		//bubblesort(arr);
		improvedBubblesort(arr);
		System.out.println("Sorted array is :");
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	private static void improvedBubblesort(int[] arr) {
		int n=arr.length;
		boolean flag;
		for(int i=0;i<n;i++) {
			flag=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
					
				}	
			}
			System.out.println(Arrays.toString(arr));
			if(!flag) {
				break;
			}
		}
		
	}
	/*private static void bubblesort(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			for(int k=0;k<n-i-1;k++) {
				if(arr[k]> arr[k+1]) { //ascending order
				int temp=arr[k];
				arr[k]=arr[k+1];
				arr[k+1]= temp;
				}
		}
			
			System.out.println(Arrays.toString(arr));
	}
	} */

	private static void bubblesort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];   //descending order
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	
	

}