package strings;
public class Anagram 
{
	public static void main(String[] args) 
	{
		String s1 = "Hitler Woman";
		String s2 = "Uncle-In-Law";
		s1 = removeSplChars(s1);
		s2 = removeSplChars(s2);
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		if(ch1.length==ch2.length)
		{
			toUpperCase(ch1);
			toUpperCase(ch2);
			bubbleSort(ch1);
			bubbleSort(ch2);
			if(compareArray(ch1,ch2))
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram character mismatch");
		}
		else
			System.out.println("***Not Anagram length not same");
	}
	static String removeSplChars(String s)
	{
		char[] ch = s.toCharArray();
		String str = "";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='A'&&ch[i]<='Z' || ch[i]>='a'&&ch[i]<='z')
				str = str + ch[i];
		}
		return str;
	}
	static void toUpperCase(char[] ch)
	{
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='a' && ch[i]<='z')
				ch[i] = (char)(ch[i] - 32);
		}
	}
	static void bubbleSort(char[] ch) 
	{
		System.out.println(ch);
		for (int i = 0; i < ch.length-1 ; i++) 
		{
			for (int j = i+1; j < ch.length; j++) 
			{
//				if (ar[i] > ar[j])//ascending 
				if (ch[i] < ch[j])//descending
				{
					char t = ch[i];
					ch[i] = ch[j];
					ch[j] = t;
				}
			}
		}
	}
	static boolean compareArray(char[] ch1,char[] ch2)
	{
		for (int i = 0; i < ch2.length; i++) 
		{
			if(ch1[i]!=ch2[i])
				return false;
		}
		return true;
	}
}
