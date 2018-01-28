package edu.introduction;

import java.util.Scanner;

public class ReadSumDisplay 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int rows=3,cols=5;
		int[][] a=new int[rows][cols];
		System.out.println("Enter values");
		for (int i = 0; i < a.length; i++) 
			for(int j=0;j<a[i].length;j++)
				a[i][j]=sc.nextInt();
		System.out.println("****************");
		int sum=0;
		for (int i = 0; i < a.length; i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				sum=sum+a[i][j];
			}
			System.out.println();
		}		
		System.out.println("Sum ="+sum);
	}
}
