package edu.simple;

public class NumberTriangle 
{
	public static void main(String[] args) {
		int n=5;
		printTriangle(n);
		printPyramid(n);
	}
	static void printPyramid(int n)
	{
		int sp=n-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
				System.out.print(' ');
			sp--;
			int num=1;
			for(int j=0;j<=i*2;j++)
			{
				if(j%2==0)
					System.out.print(num++);
				else
					System.out.print(num--);
			}
			System.out.println();
		}
	}
	static void printTriangle(int n)
	{
		int sp=n-1,elements=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
				System.out.print(' ');
			int number=1;
			for(int j=0;j<elements;j++)
			{
				if(j%2==0)
					System.out.print(number++);
				else 
					System.out.print(number--);
			}
			System.out.println();
			sp--;
			elements=elements+2;
		}
	}
}
