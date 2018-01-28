package edu.simple;
public class PatternNum 
{
	public static void main(String[] args) 
	{
		int n=3;
		printNumPattern1(n);
	}
	static void printNumPattern(int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(++count + " ");
			}
			count--;
			count=count+(n-i);
			System.out.println();
		}
	}
	static void printNumPattern1(int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j<=i)
				System.out.print((count++)%2 + " ");
				else
				{
					count++;
					//System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}
