import java.util.Arrays;

public class Bubble_sort_solved {

	public static void main(String[] args) {
		int [] arr= {3,5,1,2,34,23,7,89,89,0,4};
		System.out.println("Given array is :");
		System.out.println(Arrays.toString(arr));
		//bubbleSort(arr);
		SelectionSorr(arr);
		System.out.println("Sorted array is :");
		System.out.println(Arrays.toString(arr));
			
		
		
	}

	private static void SelectionSorr(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min_id=i;
		for(int j=i+1;j<n;j++) {
			if(arr[j]<arr[min_id]) {
				min_id=j;
			}
		}
		int temp=arr[i];
		arr[i]=arr[min_id];
		arr[min_id]=arr[i];
		}
		System.out.println(Arrays.toString(arr));
	}
/*
	private static void bubbleSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}
	*/

}
