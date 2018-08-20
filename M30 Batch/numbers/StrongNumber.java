package numbers;

public class StrongNumber 
{
	public static void main(String[] args) 
	{
		int m=0;
		System.out.println(m+"!="+findFactorial(m));
		System.out.println("**********");
		int n = 14,temp=n,sum=0;
		while(n!=0)
		{
			int rem = n%10;
			n = n/10;
			sum = findFactorial(rem)+sum;	
		}
		System.out.println(sum);
		if(sum == temp)
			System.out.println("Strong number");
		else
			System.out.println("Not Strong number");
	}
	static int findFactorial(int n)
	{
		int product =1;
		for(int i=n;i>=1;i--)
			product = product * i;
		return product;
	}
}
