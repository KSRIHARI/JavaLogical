package edu.introduction;
public class PrimeCount 
{
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,0};
		int primeSum=0,nonPrimeCount=0;
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
			int num = a[i];
			boolean res = findPrime(num);
			if(res)
			{
				primeSum=primeSum+a[i];
				//System.out.println("Prime number");
			}
			else
			{
				nonPrimeCount++;
				//System.out.println("Not prime number");
			}
		}
		System.out.println("Prime numbers sum:"+primeSum);
		System.out.println("Count of non Prime numbers:"+nonPrimeCount);
	}
	static boolean findPrime(int num)
	{
		if(num<2)
			return false;
		for(int i=2;i<=num/2;i++)
			if(num%i==0)
				return false;
		return true;
	}
}
