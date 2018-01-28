package edu.numbers;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		int num=12321;
		int temp=num,sum=0;
		while(temp>0)
		{
			int digit=temp%10;
			sum=(sum*10)+digit;
			temp=temp/10;
		}
		if(sum==num)
			System.out.println("Number is palindrome");
		else
			System.out.println("NUmber is not palindrome");
	}
}
