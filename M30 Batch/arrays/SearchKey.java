package arrays;

public class SearchKey 
{
	public static void main(String[] args) 
	{
		int[] a = {10,20,17,18,33,10};
		int key = 10;
//		if(findKey(a, key))
//			System.out.println("Key Found:"+key);
//		else
//			System.out.println("Key Not Found:"+key);
		int res=findKeyPos(a, key);
		if(res>=0)
			System.out.println("Key Found:"+key+"{at position:"+res);
		else
			System.out.println("Key Not Found:"+key);
	}
	static int findKeyPos(int[] a,int key)
	{
		for(int i=0;i<a.length;i++)
			if(key == a[i])
				return i;
		return -1;
	}
	static boolean findKey(int[] a,int key)
	{
		for(int i=0;i<a.length;i++)
			if(key == a[i])
				return true;
		return false;
	}
}
