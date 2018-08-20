package strings;

import java.util.Scanner;

public class ReverseEachWord 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Sentence:");
		String s = sc.nextLine();
		s = reverseEachWord(s);
		System.out.println("Reverse String:"+s);
	}
	static String reverseEachWord(String s)
	{
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if((i==0&&ch[i]!=' ') || (ch[i]!=' '&&ch[i-1]==' '))
			{
				int start = i;
				while(i<ch.length && ch[i]!=' ')
					i++;
				int end = i-1;
//				System.out.println("start:"+start+" end:"+end);
				doReverse(ch, start,end);
			}
		}
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
