package com.array2d;

public class MatrixShift 
{
	public static void main(String[] args) 
	{
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
//		doRowReverse(a);
//		System.out.println("After row reverse");
//		display(a);
//		System.out.println("After Column reverse");
//		doColReverse(a);
//		display(a);
		
		doTranspose(a);
		//90 right sift
		//doRowReverse(a);
		//90 left shift
		doColReverse(a);
		display(a);
	}
	static void doTranspose(int[][] a)
	{
		System.out.println("Doing transpose");
		for (int row = 0; row < a.length; row++) 
		{
			for(int column=row;column<a[row].length;column++)
			{
				int temp = a[row][column];
				a[row][column] = a[column][row];
				a[column][row] = temp;
			}
		}
	}
	static void doRowReverse(int[][] a)
	{
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length/2;col++)
			{
				int temp = a[row][col];
				a[row][col] = a[row][a[row].length-1-col];
				a[row][a[row].length-1-col] = temp;
			}
		}
	}
	static void doColReverse(int[][] a)
	{
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length/2;col++)
			{
				int temp = a[col][row];
				a[col][row] = a[a[row].length-1-col][row];
				a[a[row].length-1-col][row] = temp;
			}
		}
	}
	static void display(int[][] a)
	{
		//display using array
		for (int row = 0; row < a.length; row++) 
		{
			for(int column=0;column<a[row].length;column++)
				System.out.print(a[row][column]+" ");
			System.out.println();
		}
		System.out.println("****************");
	}
}
