package arrays;

public class ArraySum 
{
	public static void main(String[] args) {
		int[] a = {10,12,17,11,10};
		findEvenIndexSum(a);
		findOddIndexSum(a);
	}
	static void findEvenIndexSum(int[] a)
	{
		int sum = 0;
		for (int i = 0; i < a.length; i=i+2) 
		{
//			if(i%2 == 0)
				sum = sum + a[i];
		}
		System.out.println(sum);
	}
	static void findOddIndexSum(int[] a)
	{
		int sum = 0;
		for (int i = 1; i < a.length; i=i+2) 
		{
//			if(i%2 == 0)
				sum = sum + a[i];
		}
		System.out.println(sum);
	}
}
