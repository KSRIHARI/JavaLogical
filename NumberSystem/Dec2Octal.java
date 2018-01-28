class Dec2Octal
{
	public static void main(String args[])
	{
		int dec=10;
		String st="";
		int i=0;
		//String st1="";
		while(dec>0)
		{
			int r=dec%8;
			dec=dec/8;
			st=r+st;
			i=(i*10)+r;
			//st1=st1+r;
		}
		System.out.println("st:"+st);
		System.out.println("i:"+i);
		//System.out.println("st1:"+st1);
	}
}