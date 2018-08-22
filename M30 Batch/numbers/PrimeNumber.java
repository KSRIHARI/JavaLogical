package numbers;
public class PrimeNumber {
	public static void main(String[] args) 
	{
		int count=0;
		for(int i=1;i<=10;i++)
		{
			if(isPrime(i))
			{
				System.out.println("Prime:"+i);
				count++;
			}
		}
		System.out.println("Count of prime within range:"+count);
//		else
//			System.out.println("Non Prime:"+n);
	}
  	static boolean isPrime(int n)
	{
		if(n<2)
			return false;
		for(int i=2;i<=n/2;i++)
			if(n%i ==0)
				return false;
		return true;
	}
}
