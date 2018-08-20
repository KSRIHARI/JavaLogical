package strings;

import java.util.Scanner;

public class ReverseString 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Sentence:");
		String s = sc.nextLine();
		s = reverseSentence(s);
		System.out.println("Reverse String:"+s);
	}
	static String reverseSentence(String s)
	{
		char[] ch = s.toCharArray();
		int start = 0, end = ch.length-1;
		doReverse(ch, start,end);
//		doReverse(ch, 0, ch.length-1);
		return new String(ch);
	}
	static void doReverse(char[] ch,int start,int end)
	{
		while(start<end)
		{
			char t = ch[start];
			ch[start] = ch[end];
			ch[end] = t;
			start++;
			end--;
		}
	}
}
