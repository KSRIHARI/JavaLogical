package arrays;

public class Unique 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,1};
		int[] b ={3,1,7,2,1};
		displayUnique(a, b);
		displayUnique(b, a);
	}
	static void displayUnique(int[] a,int[] b)
	{
		for(int i=0;i<a.length;i++)
		{
//			boolean flag=false;
//			int count=0;
			int j=0;
			for(;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
//					flag = true;
//					count++;
					break;
				}
			}
//			if(flag==false)
//			if(count!=0)
			if(j==b.length)
			{
//				System.out.println("Found Unique at position:"+j);
				System.out.println("Unique Value is:"+a[i]);
			}
		}
	}
}
