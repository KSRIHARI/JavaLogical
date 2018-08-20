package arrays;

public class MergeArrays 
{
	public static void main(String[] args) 
	{
		int[] a = {3};
		int[] b = {4,6};
//		int[] c = mergeArrays(a,b);
		int[] c = mergeOneLoop(a, b);
		display(c);
	}
	static int[] mergeArrays(int[] a,int[] b)
	{
		int[] c = new int[a.length+b.length];
		int k = 0;//k is index for c array
		for(int i=0;i<a.length;i++)
			c[k++]=a[i];
		for(int i=0;i<b.length;i++)
			c[k++] = b[i];
		return c;
	}
	static int[] mergeOneLoop(int[] a,int[] b)
	{
		int[] c= new int[a.length+b.length];
		for(int k=0;k<c.length;k++)
		{
			if(k<a.length)
				c[k] = a[k];
			else
				c[k] = b[k-a.length];
		}
		return c;
	}
	static void display(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.println("["+i+"]="+a[i]);
	}
}
