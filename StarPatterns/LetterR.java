package edu.alphabet;

public class LetterR 
{
	public static void main(String[] args) 
	{
		char c=3;
		System.out.println(c);
	//	r();
	}
	static void m()
	{
		int n=7;
		for(int i=0;i<n;i++)
		{
			//A
			for(int j=0;j<=n/2+1;j++)
			{
				if(j==0&&i!=0
					||j==n/2&&i!=0
					||i==n/2&&j<=n/2 || i==0&&j==n/4)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.print(" ");
			//V
			for(int j=0;j<=n/2+1;j++)
			{
				if(j==0&&i!=n-1
					|| j==n/2&&i!=n-1
					|| i==n-1&&j==n/4+1)
					System.out.print('*');
				else
					System.out.print('~');
			}
			
			
			
			
			
			System.out.println();
		}
	}
}
