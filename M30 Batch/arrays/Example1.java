package arrays;
public class Example1 
{
	static void show(int[] b)
	{
		System.out.println("b->"+b);
		System.out.println("b[0]:"+b[0]);
		System.out.println("b[2]:"+b[2]);
		b[1] = 14;
		b[3]++;
		int i=1;
//		b[++i]++;
		b[i++]++;
	}
	public static void main(String[] args) 
	{
		int[] a = {10,100,25,12};
		System.out.println("a->"+a);
		System.out.println("a[1]:"+a[1]);
		show(a);
		System.out.println("a[0]:"+a[0]);
		System.out.println("a[1]:"+a[1]);
		System.out.println("a[2]:"+a[2]);
		System.out.println("a[3]:"+a[3]);
		System.out.println("a[1]:"+a[1]);
		
	}
}
