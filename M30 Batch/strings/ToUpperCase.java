package strings;

import java.util.Scanner;

public class ToUpperCase 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Word:");
		String s = sc.nextLine();
		s = toUpperCase(s);
		System.out.println("After Conversion:"+s);
	}
	
	static String toUpperCase(String s)
	{
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='a' && ch[i]<='z')
				ch[i] = (char)(ch[i] - 32);
		}
		return new String(ch);
	}
}
