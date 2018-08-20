package strings;
public class FindingWord 
{
	public static void main(String[] args) 
	{
		String s1 = "day is a day for holiday day";
		String s2 = "day";
//		if(findWord(s1, s2))
		int count=countFindWord(s1, s2);
		if(count>0)
			System.out.println("Found "+count+" number of times");
		else
			System.out.println("Not Found");
	}
	static boolean findWord(String s1,String s2)
	{
		char[] main = s1.toCharArray();
		char[] word = s2.toCharArray();
		for(int i=0;i<main.length;i++)
		{
			if((i==0&&main[i]!=' ') || (main[i]!=' '&&main[i-1]==' '))
			{
				int j=0;
				while(j<word.length && main[i]==word[j])
				{
					i++;
					j++;
				}
				if(i==main.length&&j==word.length || main[i]==' '&&j==word.length)
					return true;
			}
		}
				
		return false;
	}
	static int countFindWord(String s1,String s2)
	{
		char[] main = s1.toCharArray();
		char[] word = s2.toCharArray();
		int count=0;
		for(int i=0;i<main.length;i++)
		{
			if((i==0&&main[i]!=' ') || (main[i]!=' '&&main[i-1]==' '))
			{
				int j=0;
				while(j<word.length && main[i]==word[j])
				{
					i++;
					j++;
				}
				if(i==main.length&&j==word.length || main[i]==' '&&j==word.length)
					count++;
//					return true;
			}
		}
				
		return count;
//		return false;
	}
}
