package eduu.simple;

public class Pattern1 
{
	public static void main(String[] args) {
		int n=7;
		printPattern(n);
	}
	static void printPattern(int n)
	{
		int num=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(num+++" ");
				//num++;
				//num=num+1;
			}
			System.out.println();
		}
	}
}
