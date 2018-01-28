package edu.introduction;

import java.util.Scanner;

public class Knowing2d 
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size:");
		int row=sc.nextInt();
		System.out.println("Enter column size:");
		int col=sc.nextInt();	
		int[][] a=new int[row][col];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
				System.out.print("a["+i+"]["+j+"]="+a[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println(sum);
	}
}
