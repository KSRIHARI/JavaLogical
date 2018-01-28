package edu.simple;

public class FilledDiamond 
{
	public static void main(String[] args) 
	{
		int n=9;
		printFilledDiamond(n);
	}
	static void printFilledDiamond(int n)
	{
		int sp=n/2,st=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
				System.out.print('@');
			for(int j=0;j<st;j++)
				System.out.print(' ');
			for(int j=0;j<sp;j++)
				System.out.print('@');
			System.out.println();
			if(i<n/2)
			{
				st=st+2;
				sp--;
			}
			else
			{
				st=st-2;
				sp++;
			}
			//System.out.println();
		}
	}
}
