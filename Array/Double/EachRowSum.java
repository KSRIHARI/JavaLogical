package edu.introduction;

public class EachRowSum 
{
	public static void main(String[] args) {
		int a[][]={{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},
				{1,1,1,1,1},{1,1,1,1,1}};
		for(int row=0;row<a.length;row++)
		{
			int sum=0;
			System.out.print("row no:"+(row+1));
			for(int col=0;col<a[row].length;col++)
				sum=sum+a[row][col];
			System.out.print("\tsum:"+sum);
			System.out.println();
			
		}
	}
}
