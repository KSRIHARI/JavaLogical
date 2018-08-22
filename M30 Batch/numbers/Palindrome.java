package numbers;

public class Palindrome 
{
	public static void main(String[] args) {
		if(isPlaindrome(101))
			System.out.println("Palindrome number");
		else
			System.out.println("Not Palindrome");
	}
	static boolean isPlaindrome(int n)
	{
		int t=n,res=0;
		while(n>0)
		{
			int rem = n%10;
			res = (res*10) + rem;
			n=n/10;
		}
		System.out.println("t:"+t);
		System.out.println("res:"+res);
		return t==res;
//		if(t==res)
//			return true;
//		else
//			return false;
	}
}
