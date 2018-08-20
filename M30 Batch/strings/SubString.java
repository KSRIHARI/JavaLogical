package strings;

public class SubString 
{
	public static void main(String[] args) 
	{
		String s1 = "aaaAAAaaaA";
		String s2 = "AaA";
		s1 = toLowerCase(s1);
		s2 = toLowerCase(s2);
		int count = findSubString(s1, s2);
		System.out.println("SubString found:"+count+" time");
	}
	static String toLowerCase(String s)
	{
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='A'&&ch[i]<='Z')
				ch[i] = (char)(ch[i]+32);
		}
		return new String(ch);
	}
	static int findSubString(String s1,String s2)
	{
		char[] main = s1.toCharArray();
		char[] word = s2.toCharArray();
		int count=0;
		for(int i=0;i<main.length;i++)
		{
			int j=0;
			if(main[i]==word[j])
			{
				int t=i;
		while(j<word.length&&t<main.length && main[t]==word[j])
				{
//					System.out.println("t:"+t);
					t++;
					j++;
				}
			}
			if(j==word.length)
			{
				System.out.println("substring found");
				count++;
			}
		}
		return count;
	}	
}
