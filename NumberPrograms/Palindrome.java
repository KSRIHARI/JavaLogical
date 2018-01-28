package edu.numbers;
import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args) 
	{
		Palindrome palindrome = new Palindrome();
		int num=palindrome.readNumber();
		boolean res=palindrome.findPalindrome(num);
		if(res==true)
			System.out.println("NUmber is palindrome");
		else
			System.out.println("Number is not palindrome");
	}
	int readNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to validate:");
		int num=sc.nextInt();
		return num;
	}
	//return true: number is palindrome
	//return false: number is not palindrome
	boolean findPalindrome(int num)
	{
		int reversedNumber = reverseNumber(num);
		if(num==reversedNumber)
			return true;
		else
			return false;
	}
	int reverseNumber(int num)
	{
		int revnum=0;
		while(num>0)
		{
			int digit=num%10;
			revnum=(revnum*10)+digit;
			num=num/10;
		}
		return revnum;
	}
}
