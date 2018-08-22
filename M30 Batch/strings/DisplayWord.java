package strings;

public class DisplayWord 
{
	public static void main(String[] args) {
		String s = "    Good     Morning      all     ";
		displayWithoutSplit(s);
//		displayWord(s);
	}
	static void displayWithoutSplit(String s)
	{
		char[] ch = s.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if((i==0 && ch[i]!=' ') || (ch[i]!=' '&&ch[i-1]==' '))
			{
//				System.out.println(ch[i]);//display 1st character of each word
				count++;
				while(i<ch.length && ch[i]!=' ')
					System.out.print(ch[i++]);
				System.out.println();
			}
		}
		System.out.println("Number of words:"+count);
	}
	static void displayWord(String s)
	{
		String[] s1 =s.split(" ");
		System.out.println(s1.length);
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
	}
}
