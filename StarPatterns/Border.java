package edu.simple;

public class Border 
{
	public static void main(String[] args) 
	{
		int n=5;
		printBorder(n);
	}
	static void printBorder(int n)
	{
		for (int i = 0; i < n; i++) 
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 ||  i==n-1 || j==0 || j==n-1)
					System.out.print('&');
				else if(i==n/2&&j==n/2)
					System.out.print('$');
				else
					System.out.print('*');
			}
			System.out.println();
		}
	}
}
