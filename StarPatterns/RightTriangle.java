package edu.simple;

public class RightTriangle 
{
	public static void main(String[] args) {
		int n=11;
		printRightTriangle(n);
	}
	static void printRightTriangle(int n)
	{
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(i==j|| j==0 || i==n-1)
					System.out.print('$');
				else
					System.out.print('*');
				//else
					//System.out.print(' ');
			}System.out.println();
		}
	}
}
