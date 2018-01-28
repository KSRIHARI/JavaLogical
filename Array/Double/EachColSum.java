package edu.introduction;

public class EachColSum 
{
	public static void main(String[] args) 
	{
		int a[][]={{1,1,1,1,1},  {1,1,1,1,1},  {1,1,1,1,1},
		  		   {1,2,3,4,5},  {1,1,1,1,1}};
		for(int row=0;row<a.length;row++)
		{
			int sum=0;
			System.out.print("col no:"+(row+1));
			for(int col=0;col<a[row].length;col++)
				sum=sum+a[col][row];
			System.out.print("  sum:"+sum);
			System.out.println();
			
		}
	}
}
