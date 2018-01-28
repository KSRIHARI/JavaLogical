package edu.numbers;
public class Strong 
{
	public static void main(String[] args) 
	{
		int num=108;
		int temp=num,sum=0;
		while(num>0)
		{
			sum=sum+factorial(num%10);
			num=num/10;
		}
		if(sum==temp)
			System.out.println("The number is strong"+temp);
		else
			System.out.println("The number is not strong"+temp);
	}
	static int factorial(int n)
	{
//		System.out.print("Factorial of:"+n+"->");
		int res=1;
		while(n>0)
		{
			res=res*n;
			n=n-1;
		}
//		System.out.println(res);
		return res;
	}
}
