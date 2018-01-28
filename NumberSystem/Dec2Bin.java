class Dec2Bin
{
	public static void main(String args[])
	{
		int dec=10;
		String st="";
		int b=0;
		String st1="";
		while(dec>0)
		{
			int r=dec%2;
			dec=dec/2;
			st=r+st;
			b=(b*10)+r;
		}
		System.out.println("st:"+st);
		System.out.println("b:"+b);
	}
}