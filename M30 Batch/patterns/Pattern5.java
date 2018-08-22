package patterns;

public class Pattern5 
{
	public static void main(String[] args) 
	{
		int n=7,star=1,val=n/2;
		for(int i=0;i<n;i++)//rows
		{
			int t=val;
			for(int j=0;j<star;j++)//cols
				System.out.print(t++);
			System.out.println();
			if(i<n/2)
			{
				star++;
				val--;
			}
			else
			{
				star--;
				val++;
			}
		}
	}
}
