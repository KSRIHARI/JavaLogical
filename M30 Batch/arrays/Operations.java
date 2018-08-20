package arrays;

import java.util.Arrays;

public class Operations 
{
	public static void main(String[] args) 
	{
//		int res =0,m=2,n=3;
//		res = doMultiply(m,n);
//		System.out.println(res);
		String s[] = new String[]{"1","9","10"};
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
	}
	static int doMultiply(int m,int n)
	{
		int res = 0;
		while(n>0)
		{
//			res = res + m;
			res+=m;
			n--;
		}
		return res;
	}
}
