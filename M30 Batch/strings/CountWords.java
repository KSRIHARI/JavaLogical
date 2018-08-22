package strings;

public class CountWords 
{
	public static void main(String[] args) {
		String s="Good    Morning    Alll";
		String res = countWords(s);
		System.out.println(res);
	}
	static String countWords(String s)
	{
		String result="";
		char[] ch = s.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if((i==0&&ch[i]!=' ') || (ch[i]!=' '&&ch[i-1]==' '))
			{
//				count++;
				while(i<ch.length&&ch[i]!=' ')
				{
					result = result+ch[i++];
				}
//				System.out.println(result);
				count++;
				result=result+count;
				result=result+" ";
			}
		}
		return result;
	}
}
