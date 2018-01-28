class Bin2Dec
{
	public static void main(String args[])
	{
		int bin=101,dec=0,count=0;
		while(bin>0)
		{
			int r=bin%10;
			bin=bin/10;
			//count++;
			if(r!=0)
				dec=dec+power(2,count);
			count++;
		}
		System.out.println(dec);
	}
	public static int power(int n,int r)
	{
		int res=1;
		while(r>0)
		{
			res=res*n;
			r--;
		}
		return res;
	}
}