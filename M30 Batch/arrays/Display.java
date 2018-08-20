package arrays;

public class Display 
{
	public static void main(String[] args) {
		int[] a = {10,12,17,11,10};
		evenWithOddPos(a);
		oddWithEvenPos(a);
	}
	static void evenWithOddPos(int[] a)
	{
		System.out.println("displaying evenWithOddPos");
		for (int i = 1; i < a.length; i=i+2) 
		{
			if(a[i]%2==0)
				System.out.println("["+i+"]"+"="+a[i]);
		}
	}
	static void oddWithEvenPos(int[] a)
	{
		System.out.println("displaying OddWithEvenPos");
		for (int i = 0; i < a.length; i=i+2) 
		{
			if(a[i]%2==1)
				System.out.println("["+i+"]"+"="+a[i]);
		}
	}
}
