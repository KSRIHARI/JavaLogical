package edu.numbers;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int num=10;
//		boolean res=
		findPrime(num);
//		if(res)
//			System.out.println("Prime number");
//		else
//			System.out.println("Not a prime number");
	}
	static void findPrime(int num)
	{
//		if(num<=1)	return false; 
//		boolean flag=true;
//		int loopCOunt=0;
		for(int i=2;i<=num/2;i++)
		{
//			loopCOunt++;
			if(num%i==0)
			{
//				flag=false;
				System.out.println("not Prime number");
				//break;
				return;
			}
		}
		System.out.println("Prime number");
//		System.out.println("Loops count:"+loopCOunt);
//		if(flag==true)
//			return true;
//		else
//			return false;
	}
	static boolean isPrime(int num)
	{
		int count=0;
		int loopCOunt=0;
		for(int i=1;i<=num;i++)
		{
			loopCOunt++;
			if(num%i==0)
				count++;
		}
		System.out.println("Loops count:"+loopCOunt);
		if(count==2)
			return true;
		else
			return false;
	}
}
