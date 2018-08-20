package arrays;

public class SwapHalf 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,6};
		swapValues(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	static void swapValues(int a[])
	{
		int i=0,n=a.length;
		int j=n - n/2;
		while(j<a.length)
		{
			int t = a[i];
			a[i] = a[j];
			a[j] =t;
			i++;
			j++;
		}
	}
}
