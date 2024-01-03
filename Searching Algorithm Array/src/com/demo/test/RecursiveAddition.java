package com.demo.test;

import java.util.Scanner;

public class RecursiveAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		int addition=add(n);
		
		System.out.println("Addition Of Number =" +addition);
		
			
		}

	private static int add(int n) {
		if(n<0) {
			return -1;
		}else if(n==1) {
			return 1;
		}else {
			return n+add(n-1);
		}
	}
		

	}


