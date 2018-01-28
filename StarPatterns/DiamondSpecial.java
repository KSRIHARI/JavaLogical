package edu.simple;

public class DiamondSpecial 
{
	public static void main(String[] args) 
	{
		int n=7;
		printDiamondSpecial(n);
	}
	static void printDiamondSpecial(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j || i+j==n-1)	//diagonal elements
					System.out.print('@');
				else if(i+j==n/2)		//diamond left upper
					System.out.print('#');
				else if(i-j==n/2)		//diamond left lower
					System.out.print('*');
				else if(j-i==n/2 )			//diamond right upper
					System.out.print('^');
				else if((i+j)==(n+n/2-1))	//diamond right lower
					System.out.print('&');
				else
					System.out.print('-');
			}
			System.out.println();
		}
	}
}
