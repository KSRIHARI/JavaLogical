package edu.simple;

public class Symbol1 
{
	public static void main(String[] args) {
//		s1(7);
		print(9);
	}
	static void s1(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(i+j<n-1)//|| i==j)// && i<n/2 && j<n/2 )
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
	static void print(int n)
	{
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 if(j<=i&&i+j<=n-1)
					 System.out.print('*');
				 else if(i+j>=n-1 && j>=i)
					 System.out.print('*');
				 else
					 System.out.print(' ');
			 }
			 System.out.println();
		 }
	}
}
