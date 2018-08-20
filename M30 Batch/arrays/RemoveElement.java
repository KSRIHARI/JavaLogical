package arrays;

public class RemoveElement 
{
	public static void main(String[] args) 
	{
		int[] a= {10,12,10,13,11};
		int key=10;
		System.out.println("Before removing:ArraySize:"+a.length);
		display(a);
		a = removeElement(a, key);
		System.out.println("After removing:ArraySize:"+a.length);
		display(a);
	}
	static int[] removeElement(int[] a,int key)
	{
		int[] b = new int[a.length-1];
		for(int i=0,j=0;i<a.length;i++)
		{
			if(a[i]!=key)
			{
				b[j]=a[i];
				j++;
			}
		}
		return b;
	}
	static void display(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.println("["+i+"]="+a[i]);
	}
}
