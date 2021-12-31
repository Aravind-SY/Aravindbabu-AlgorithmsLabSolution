package com.labassignment2.gl;

import java.util.Scanner;

public class Paymoney {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the transaction Array");
		
		int size = sc.nextInt();
		
		int []trns = new int[size];
		
		System.out.println("Enter the value of Array");
		
		for (int i=0; i<size; i++)
			
			trns[i] =  sc.nextInt();
		System.out.println("Enter the total number of targets to be acheived :");
		int targetNo =  sc.nextInt();
		while (targetNo--!=0)
		{
			
			int target;
			System.out.println("Enter the value of Target");
			target = sc.nextInt();
			
			int sum = 0;
			
			for (int i=0; i<size; i++) {
				
				sum += trns[i];
			
			if (sum >= target) {
				System.out.println("Target acheived after"+" "+ (i+1) +" "+"transaction");
				
				break;
			}
			else
				System.out.println("Target is not achieved");
			}
		}

	}

}
