package numbers;
public class SumOfnNumber{
	public static void main(String[] args) 
	{
		int n=5,sum;
		sum = findSumOfN(n);
		System.out.println(sum);
	}
	static int findSumOfN(int n)
	{
		int sum=0;
//		for(int i=0;i<=n;i++)
//			sum = sum +i;
		int i=1;
		while(i<=n)
		{
			sum=+i++;
//			sum+=i++;
//			sum = sum + i;
//			i++;
		}
		System.out.println(i);
		return sum;
	}
}
