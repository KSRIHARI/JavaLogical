package patterns;

public class Pattern6 
{
	public static void main(String[] args) 
	{
		int n=9;
		for(int i=0;i<n;i++)//rows
		{
			//A
			for(int j=0;j<n;j++)//cols
			{
				if(i==0&&j!=0&&j!=n-1 || i==n/2 
						|| j==0&&i!=0 || j==n-1&&i!=0)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.print("  ");
			//B
			for(int j=0;j<n;j++)//cols
			{
				if(i==0&&j!=n-1 ||
						j==0 
						|| i==n/2&&j!=n-1 || 
						i==n-1&&j!=n-1
						|| j==n-1&&i!=0&&i!=n-1&&i!=n/2)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
}
