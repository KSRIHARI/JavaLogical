package arrays;

public class ConsecutiveSum 
{
	public static void main(String[] args) 
	{
		int[] a = {40,12,117,11,20};
		highestConsecutiveSum(a);
	}
	static void highestConsecutiveSum(int a[])
	{
		int highestSum=0,index=0;
		for (int i = 0; i < a.length-1; i++) 
		{
			System.out.print(a[i]+"+"+a[i+1]+"=");
			int sum = a[i] + a[i+1];
			System.out.println(sum);
			if(sum > highestSum)
			{
				highestSum = sum;
				index = i;
			}
		}
		System.out.print("HighestSum=");
		System.out.println(a[index]+"+"+a[index+1]+"="+highestSum);
	}
}
