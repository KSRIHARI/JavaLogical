package patterns;

public class Pattern2 
{
	public static void main(String[] args) 
	{
		int n=9;
		for(int i=0;i<n;i++)//rows
		{
			for(int j=0;j<=i;j++)//cols
			{
					System.out.print('*');
			}
			System.out.println();
		}
	}
}
