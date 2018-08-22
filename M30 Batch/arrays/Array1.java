package arrays;

public class Array1 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5};
//		int[] b;
//		b={1,2,3,4};
		findSum(a);
	}
	static int findSum(int[] a)
	{
		int sum=0,n=a.length-1;
		for(int i=0;i<=n;i++)
			sum = sum + a[i];
		System.out.println("Sum:"+sum);
		return sum;
	}
}
