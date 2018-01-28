package edu.numbers;

public class Factors 
{
	public static void main(String[] args) 
	{
		int start=1,end=5;
		//for(int i=start;i<=end;i++)
		//		findFactors(i);	
//		for(;start<=end;start++)
		//	findFactors(start);
		while(start<=end)
			findFactors(start++);
	}
	static void findFactors(int n)
	{
		System.out.println("****Finding factors of:"+n+"*******");
		int count=0;
		for(int i=n;i>0;i--)
		{
			if(n%i==0)
			{
				System.out.print(i+"\t");
				count++;
			}
		}
		System.out.println("\ncount of factors for:"+n+":is:"+count);
	}
}
