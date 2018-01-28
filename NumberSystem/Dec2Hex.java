class Dec2Hex
{
	public static void main(String[] a)
	{
		String hex="";
		int dec=15;
		while(dec>0)
		{
			int r=dec%16;
			dec=dec/16;
			if(r>9 && r<16)
				hex=(char)(r+55)+hex;
			else
				hex=r+hex;
		}
		System.out.println("hexadecimal value:"+hex);
	}
}