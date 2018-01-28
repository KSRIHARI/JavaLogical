package edu.simple;

public class RightTria 
{
	public static void main(String[] args) 
	{
		int n=7;
		displayPattern(n);
	}
	static void displayPattern(int n)
	{
		int sp=n-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
				System.out.print(' ');
			//sp--;
			for(int k=0;k<=i;k++)
				System.out.print('*');
			sp--;
			System.out.println();
		}
	}
}
