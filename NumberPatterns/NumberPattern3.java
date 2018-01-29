package eduu.simple;

public class Pattern3 {
	public static void main(String[] args) {
		int n=5;
		printPattern(n);
	}
	static void printPattern(int n)
	{
		int sp=n-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
				System.out.print("~");
			sp--;
			int num=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(i+" ");
				//System.out.print(num+++" ");
				//num++;
				//num=num+1;
			}
			System.out.println();
		}
	}
}
