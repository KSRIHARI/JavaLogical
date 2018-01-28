package edu.matrix;

import java.util.Scanner;

public class RotateLeft 
{

	public static void main(String[] args) 
	{
		int[][] a={{1,2,3},
				   {4,5,6},
				   {7,8,9}};
		System.out.println("1 for 90 left rotate");
		System.out.println("2 for 180 left rotate");
		System.out.println("3 for 270 left rotate");
		System.out.println("4 for 360 left rotate");
		System.out.print("Enter your option:");
		Scanner sc = new Scanner(System.in);
		int option=sc.nextInt();
		rotate(option,a);
		display(a);
	}
	static void rotate(int option,int[][] a)
	{
		for(int i=0;i<option;i++)
		{
			doTranspose(a);
			doColReverse(a);
		}
	}
	static void doColReverse(int[][] a)
	{for(int i=0;i<a.length;i++)
	{
		int k=a.length-1;
		for(int j=0;j<k;j++,k--)
		{
			int temp=a[j][i];
			a[j][i]=a[k][i];
			a[k][i]=temp;
		}
	}
	}
	static void doTranspose(int[][] a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			for(int j=i;j<a[i].length;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
	}
	static void display(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
	}
}
