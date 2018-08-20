package arrays;

public class SearchOcurrence 
{
	public static void main(String[] args) {
		int[] a = {10,12,10,13,10,10};
		int key = 100;
		int ocurrence = 3;
		int res = findKey(a,key,ocurrence);
		if(res >= 0)
			System.out.println("Key found at position:"+res);
		else
			System.out.println("Key not found");
	}
	static int findKey(int[] a,int key,int ocurrence)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(key == a[i])
			{
				count++;
				if(count == ocurrence)
					return i;
			}
		}
		return -1;
	}
}
