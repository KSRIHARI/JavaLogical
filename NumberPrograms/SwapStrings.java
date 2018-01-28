package edu.numbers;

public class SwapStrings 
{
	
	public static void main(String[] args) {
	
		int x=10,y=20;
		x=swap1(y,y=x);
		System.out.println(x);
		System.out.println(y);
		String s1="hello";
		String s2="hi";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("8888888888888888888");
		s1=swap(s2,s2=s1);
		System.out.println(s1);
		System.out.println(s2);
	}
	static int swap1(int x,int y)
	{
		return x;
	}
	static String swap(String s1,String s2)
	{
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("888*************88888");
		return s1;
	}
}
