package patterns;

public class Pattern1 
{
	public static void main(String[] args) 
	{
		int n=9;
		for(int j=0;j<n;j++)//rows
		{
			for(int i=0;i<n;i++)//cols
			{
				if(i%2!=0 || i==n/2&&j==n/2)
					System.out.print(' ');
				else
					System.out.print('*');
			}
			System.out.println();
		}
	}
}
