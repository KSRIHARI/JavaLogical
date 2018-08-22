package patterns;

public class Pattern4 
{
	public static void main(String[] args) 
	{
		int n=9,space=n-1;
		for(int i=0;i<n;i++)//rows
		{
			for(int j=0;j<space;j++)//cols
				System.out.print(' ');
			space--;
			for(int j=0;j<=i;j++)//cols
				System.out.print(i+1 +" ");
			System.out.println();
		}
	}
}
