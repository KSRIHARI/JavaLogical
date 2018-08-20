package arrays;

public class Duplicate 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,1};
		int[] b ={3,1,7,2,1};
		displayDuplicates(a, b);
	}
	static void displayDuplicates(int[] a,int[] b)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}
