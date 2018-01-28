package edu.alphabet;

public class LetterA 
{
	public static void main(String[] args) 
	{
		//c(7);
		cab();
	}
	static void cab()
	{
		int n=7;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0&&j!=0 || i==n-1&&j!=0 
						|| j==0&&i!=0 && j==0&&i!=n-1)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.print("    ");//System.out.println();
//		}
//		for(int i=0;i<n;i++)
//		{
			for(int j=0;j<n;j++)
			{
				if(j==0&&i>=n/2 || j==n-1&&i>=n/2 || i==n/2
						|| i+j==n/2 || j-i==n/2)	
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.print("    ");
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0&&j!=n-1 || i==n-1&&j<n-1
					|| i==n/2&&j<n-1
					|| j==n-1&&(i!=0&&i!=n/2&&i!=n-1))
					System.out.print('*');
				else
					System.out.print(' ');
			}System.out.print("    ");
			System.out.println();
		}
	}
	static void c(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0&&j!=0 || i==n-1&&j!=0 
						|| j==0&&i!=0 && j==0&&i!=n-1)
					System.out.print('*');
				else
					System.out.print(' ');
			}System.out.println();
		}
	}
	static void b(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0&&j!=n-1 || i==n-1&&j<n-1
					|| i==n/2&&j<n-1
					|| j==n-1&&(i!=0&&i!=n/2&&i!=n-1))
					System.out.print('*');
				else
					System.out.print(' ');
			}System.out.println();
		}
	}
	static void a()
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
//				if(i==0&&(j!=0&&j !=n-1) || //line1
//						i==n/2 || //middle line
//						j==0&&i!=0 || //column1
//						j==n-1&&i!=0)//last column
				if(j==0&&i>=n/2 || j==n-1&&i>=n/2 || i==n/2
						|| i+j==n/2 || j-i==n/2)	
					System.out.print('*');
				else
					System.out.print(' ');
			}System.out.println();
		}
	}
}
