package com.demo.test;
import java.util.Scanner;

	public class BinarySearchArray {

		private static void acceptData(int[] arr) {
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter "  +(i+1)+  " Number:");
				arr[i]=sc.nextInt();
			}
			
		}	
		

		private static int binarySearchNumber(int[] arr, int search) {
			
			int first=0, last=arr.length,compcnt=0;
			
			while(first<=last)
			{
				int mid = (first+last)/2;
				compcnt++;
				if(arr[mid]==search)
					return mid;
				
				else if(arr[mid]<search)
					first = mid+1;
				else
					last=mid-1;
			}
			
			System.out.println("Number Of Comparisons : " +compcnt);
			return -1;
			
		}
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			int [] arr=new int[n];
			
			acceptData(arr); 
			
			System.out.println("Enter number to Search :");
			int search=sc.nextInt();
			int pos = binarySearchNumber(arr,search);
			if(pos!=0)
			{
				System.out.println("Element Found At : "+pos);
			}
			else
			{
				System.out.println("Element Not Found ");
			}
		}

	

		
			
	}

