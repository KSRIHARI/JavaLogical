package edu.numbers;

public class Fibonacci 
{
	public static void main(String[] args) {
		findFib(10);
	}
	static void findFib(int n)
	{
		int first=0,second=1,next;
		for(int i=0;i<n;i++)
		{
			if(i<2)
				next=i;
			else
			{
				next=first+second;
				first=second;
				second=next;
			}
				System.out.println(next);
		}
	}
}
