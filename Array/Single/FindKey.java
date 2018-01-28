package edu.introduction;

public class FindKey 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,7,5,6,7};
		int key=7,count=0;
		count=findKey(a,key);
		if(count!=0)
			System.out.println("Key is present:"+count);
		else
			System.out.println("Key not found");
	}
	static int findKey(int[] a,int key)
	{
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(key==a[i])
			{
				count++;
				System.out.println("key is at:"+i+1+" position");
			}
		}
		return count;
	}

}
