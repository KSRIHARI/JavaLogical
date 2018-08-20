package arrays;

public class MergeZigzag 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,7,8,9,0,9};
		int[] b = {3,4,5,6};
//		mergeZigzag(a, b);
		zigzagUsingFor(a, b);
	}
	static void zigzagUsingFor(int[] a,int[] b)
	{
		int[] c = new int[a.length + b.length];
		int j=0;
		for(int i=0;i<c.length;)
		{
			if(j<a.length)
				c[i++] = a[j];
			if(j<b.length)
				c[i++] = b[j];
			j++;
		}
		display(c);
	}
	static void mergeZigzag(int[] a,int[] b)
	{
		int[] c = new int[a.length + b.length];
		int i=0,j=0;
		while(j<a.length&&j<b.length)
		{
			c[i++] = a[j];
			c[i++] = b[j];
			j++;
		}
		while(j<a.length)
			c[i++] = a[j++];
		while(j<b.length)
			c[i++] = b[j++];
		display(c);
	}
	
	static void display(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.println("["+i+"]="+a[i]);
	}
}
