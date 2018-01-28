package edu.simple;

public class NumberDiamond 
{
	public static void main(String[] args) {
		int n=7;
		numberDiamond(n);
	}
	static void numberDiamond(int n)
	{
		int sp=n/2,st=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
				System.out.print('@');
			int num=1;
			for(int j=0;j<st;j++)
			{
				System.out.print(num);
				if(j<n/2)
					num++;
				else
					--num;
			}
				
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
