package edu.introduction;
public class Embed3 
{
	public static void main(String[] args) 
	{
		int[][] a = {{1,2,3,4,5},{1,2,4,5,6},
				{7,0,9,0,1},{7,8,9,0,1},{7,8,9,0,1}};
		int sum1=0,sum2=0;
		int primeCount=0,nonPrimeCount=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i<=a.length/2)
					sum1=sum1+a[i][j];
				else if(i>a.length/2)
					sum2=sum2+a[i][j];
				//to count prime nos in the array
				if(findPrime(a[i][j])==true)
					primeCount=primeCount+1;
				else
					nonPrimeCount=nonPrimeCount+1;
			}
		}
		System.out.println("sum1:"+sum1);
		System.out.println("sum2:"+sum2);
		if(sum1==sum2)
			System.out.println("Prime nos="+primeCount);
		else
			System.out.println("Non Prime nos="+nonPrimeCount);
	}
	static boolean findPrime(int n)
	{
		if(n<=1)
			return false;
		for(int i=2;i<=n/2;i++)
			if(n%i==0)
				return false;
		return true;
	}
}
