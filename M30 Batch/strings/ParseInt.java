package strings;

public class ParseInt 
{
	public static void main(String[] args) 
	{
		int sum=0;
		String concat="";
		for (int i = 0; i < args.length; i++) 
		{
			sum = sum + parseInt(args[i]);
			concat=concat+args[i];
		}
		System.out.println("Sum = "+sum);
		System.out.println("concat:"+concat);
	}
	static int parseInt(String s)
	{
		int res =0;
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			res = (res*10) + (ch[i]-48);
		}
		return res;
	}
}
