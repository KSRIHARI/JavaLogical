package edu.numbers;

public class CountDigits 
{
	public static void main(String[] args) 
	{
		int n=1987;
		System.out.println(countDigits(n));
	}
	static int countDigits(int num)
	{
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		return count;
	}
}
