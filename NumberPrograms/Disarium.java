package edu.numbers;

public class Disarium 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<200;i++)
		{int num=i;
		int count=findCount(num);
		int result=isDisarium(num,count);
		if(result==0)
			System.out.println("Number is Disarium:"+num);}
//		else
//			System.out.println("Number is not Disarium:"+num);}
	}
	static int isDisarium(int num,int count)
	{
		int temp=num,sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+power(rem, count--);
			num=num/10;
		}
		if(sum==temp)
			return 0;
		else
			return -1;
	}
	static int findCount(int num)
	{
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
//		System.out.println("COunt:"+count);
		return count;
	}
	static int power(int n,int r)
	{
		int res=1;
		while(r>0)
		{
			res=res*n;
			r--;
		}
		return res;
	}
}
