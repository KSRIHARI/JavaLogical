package edu.introduction;

import java.util.Scanner;

public class Array2d1
{
		public static void main(String[] args) 
		{
			int a[][]={{1,2,3},
					   {4,5,6,7,8},
					   {9,0,1,2},
					   {0,0},
					   {1}};
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
