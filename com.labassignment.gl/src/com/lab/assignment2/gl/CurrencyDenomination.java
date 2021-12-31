package com.lab.assignment2.gl;

import java.util.Scanner;

public class CurrencyDenomination {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Number Of Denominations: ");
		
		int denomination=scan.nextInt();
		
		int[] arr = new int[denomination];
		
		System.out.println("Enter The Denomination Values: ");
		
		for(int i=0; i<arr.length; i++) 
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter The Payment Amount: ");
		
		int payment = scan.nextInt();
		
		System.out.println();
		
		sortArray(arr);
		
		countNotes(arr,payment);
	}

	private static void countNotes(int[] arr, int payment) {
		int[] counter = new int[arr.length];
		try {
			for(int i=0;i<arr.length;i++) {
				if(payment>=arr[i]) {
					counter[i] = payment/arr[i];
					payment = payment-counter[i]*arr[i];
				}
			}
			if(payment>0) {
				System.out.println("Payment Cannot Be Achieved With Highest Denomination");
			}else {
				System.out.println("Your Payment Denomination Will Be: ");
				for(int i=0;i<arr.length;i++) {
					if(counter[i]!=0) {
						System.out.println(arr[i] + " : " + counter[i]);
					}
				}
			}
		
	}
		catch(ArithmeticException ae) {
			System.out.println("Denomination Cannot Be 0" +ae);
		}
		
	}

	private static void sortArray(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0; j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j+1] = arr[j];
					arr[j+1]=temp;
				}
			}
		}
		
	}

}
