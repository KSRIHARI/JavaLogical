package arrays;
public class ReversingArray 
{
	public static void main(String[] args) {
//		int[] a = {10,100,25,12};
//		display(a);
//		a = doReverse(a);
//		doReverse(a);
//		display(a);
		int[] b = {5,7,12,36};
		display(b);
		reverse(b);
		display(b);
	}
	static void reverse(int[] a)
	{
		int i=0,j=a.length-1;
		while(i<j)
		{
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
			i++;
			j--;
		}
//		return a;
	}
	static int[] doReverse(int[] a)
	{
		System.out.println("Reversing array");
		int[] b = new int[a.length];
		int i=a.length-1,j=0;
		while(i>=0)
		{
			b[j] = a[i];
			i--;
			j++;
		}
		return b;
	}
	static void display(int[] a)
	{
		for (int i = 0; i < a.length; i++) 
			System.out.println("a["+i+"]="+a[i]);
		System.out.println("**********************");
	}
}
