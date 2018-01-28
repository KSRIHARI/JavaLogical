package edu.introduction;
public class CountDuplicates 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,2,2,1,1,1,2};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int count=1;
			int temp=a[i];
			int j=i+1;
			while(j<n)
			{
				if(temp==a[j])
				{
					count++;
					for(int k=j;k<n-1;k++)
						a[k]=a[k+1];
					n--;
				}
				else
					j++;
			}
			System.out.println("count of: "+temp+"="+count);
		}
	}
}
