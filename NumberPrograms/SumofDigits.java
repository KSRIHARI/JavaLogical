package edu.numbers;

public class SumofDigits 
{
	public static void main(String[] args) 
	{
		int num=000035000002;
		System.out.println("The number is:"+num);
		int sumOfDigits=findSum(num);
		System.out.println("SUM:"+sumOfDigits);
		int productOfDigits=findProduct(num);
		System.out.println("PRODUCT:"+productOfDigits);
	}
	static int findProduct(int num)
	{
		int count=0;
		int product=1;
		while(num>0)
		{
			count++;
			int rem=num%10;
			product=product*rem;
			num=num/10;
		}
		System.out.println("Count="+count);
		return product;
	}
	static int findSum(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}
}
