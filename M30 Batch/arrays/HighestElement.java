package arrays;

public class HighestElement 
{
	public static void main(String[] args) 
	{
		int[] a = {10,12,17,11,10,20};
		secondHighest(a);
	}
	static void secondHighest(int[] a)
	{
		int high=0;
		int shigh=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>high)
			{
				shigh = high;
				high = a[i];
			}
			else if(a[i]>shigh)
				shigh = a[i];
		}
		System.out.println("high="+high);
		System.out.println("second high="+shigh);
	}
}
