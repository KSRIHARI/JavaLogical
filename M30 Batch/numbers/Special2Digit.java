package numbers;
public class Special2Digit 
{
	public static void main(String[] args) 
	{
		for(int i=10;i<=999;i++)
			findSpecial(i);
	}
	static void findSpecial(int n)
	{
		int sum=0,prod=1,t=n;
		while(n!=0)//while(n>0)
		{
			int rem = n%10;
			sum = sum + rem;
			prod = prod * rem;
			n/=10;
		}
		if(sum+prod == t)
			System.out.println("Special Number:"+t);
//		else
//			System.out.println("Not Special Number:"+t);
	}
}
