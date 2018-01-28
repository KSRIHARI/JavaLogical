package edu.introduction;

public class ConsecutiveSum 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,10};
		int sum=0,maxsum=0;
		for(int i=0;i<a.length-1;i++)
		{
			sum=a[i]+a[i+1];
			System.out.println(a[i]+"+"+a[i+1]+"="+sum);
			if(sum>maxsum)
				maxsum=sum;
		}
		System.out.println("Max sum:"+maxsum);
	}
}
