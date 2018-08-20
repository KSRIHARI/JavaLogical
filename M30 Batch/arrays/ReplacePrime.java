package arrays;

public class ReplacePrime 
{
	public static void main(String[] args) 
	{
		int[] a = {1,14,3,4,5};
		updateArray(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	static void updateArray(int[] a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			if(isPrime(a[i]))
			{
				//found prime
				while(isPrime(++a[i]));
//					a[i]++;
			}
			else
			{
				//found non prime
				while(isPrime(a[i])==false)
					a[i]++;
			}
		}
	}
	static boolean isPrime(int n)
	{
		if(n<2)
			return false;
		for(int i=2;i<=n/2;i++)
			if(n%i == 0)
				return false;
		return true;
	}
}
