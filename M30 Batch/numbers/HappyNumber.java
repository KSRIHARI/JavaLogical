package numbers;

public class HappyNumber 
{
	static int findPower(int n)
	{
		int pw = 1,r=2;
//		System.out.print(n+"^2"+r+"=");
		while(r>0)
		{
			pw = pw * n;
			r--;
		}
//		System.out.println(pw);
		return pw;
	}
	static void isHappy(int n)
	{
		int t = n;
		while(n>9)
		{
			int res = 0;
			while(n>0)
			{
				int rem = n%10;
//				res = res + findPower(rem);
				res = res + (rem*rem);
				n=n/10;
			}
			n = res;
		}
		if(n==1 || n==7)
			System.out.println("happy Number:"+t);
//		else
//			System.out.println("UnHappy Number");
	}
	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
			isHappy(i);
	}
}
