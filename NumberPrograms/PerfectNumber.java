package edu.numbers;
public class PerfectNumber 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=1000;i++)
		{
			int n=i;
			if(isPerfect(n))
				System.out.println("Perfect NUmber:"+n);
		}
//		else
//			System.out.println("Not Perfect NUmber:"+n);
	}
	public static boolean isPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
			if(n%i==0)
				sum=sum+i;
	//	System.out.println("sum:"+sum);
		return sum==n;
	}
}
