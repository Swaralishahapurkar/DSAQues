package com.demo.test;

import java.util.Scanner;

public class LinerSearchArray  {
	

	private static void acceptData(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Enter "+(i+1)+" Element :");
			arr[i]=sc.nextInt();
		}
		
	}
	

	private static int linerSearch(int[] arr, int se) {
		
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i]==se)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Size Of Array ");
		
		int s = sc.nextInt();
		int [] arr = new int[s];
		
		acceptData(arr);
		
		System.out.println("Enter Element To search :");
		int se = sc.nextInt();
		
		int p = linerSearch(arr,se);
		System.out.println("Element Found At " +p);
		sc.close();
	}
  
}
