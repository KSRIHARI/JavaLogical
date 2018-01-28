package edu.introduction;

import java.util.Scanner;
public class OddEvenSum 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the size of the array:");
		int size = sc.nextInt();
		int a[] = new int[size];
		readValues(a);
		display(a);
		findOddEvenSum(a);
	}
	static void findOddEvenSum(int a[])
	{
		int oddSum=0,evenSum=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2 != 0)
				oddSum = oddSum +a[i];
			if(a[i]%2 == 0)
				evenSum = evenSum +a[i];
		}
		System.out.println("Odd SUm = "+oddSum);
		System.out.println("Even Sum="+evenSum);
		return;
	}
	static void readValues(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter value for a["+i+"]=");
			a[i]=sc.nextInt();
		}
	}
	static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.println("Value at a["+i+"]="+a[i]);
	}
	static int findSum(int a[])
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
			sum=sum+a[i];
		return sum;
	}
}