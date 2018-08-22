package patterns;

public class Pattern3 
{
	public static void main(String[] args) 
	{
		int n=9;
		for(int i=0;i<n;i++)//rows
		{
//			int val=1;
			for(int j=0;j<=i;j++)//cols
			{
//					System.out.print(val++);
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
}
