package strings;

import java.util.Scanner;

public class Palindrome 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Word:");
		String s = sc.next();
		if(isPalindrome(s.toCharArray()))
			System.out.println("Palindrome word:"+s);
		else
			System.out.println("Non Palindrome word:"+s);
	}
	
	static boolean isPalindrome(char[] ch)
	{
		int start = 0,end = ch.length-1;
		while(start<end)
		{
			if(ch[start]!=ch[end])
				return false;
			start++;
			end--;
		}
		return true;
	}
}
