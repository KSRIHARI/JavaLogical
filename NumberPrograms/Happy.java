package edu.numbers;
public class Happy 
{
	public static void main(String[] args) 
	{
		int num=23;
		int sum=num;
		while(num>9)
		{
			num = findSum(num);
		}
		if(num==1 || num==7)
			System.out.println("Happy number");
		else
			System.out.println("Sad number");
	}
	static int findSum(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+(rem*rem);
			num=num/10;
		}
		return sum;
	}
}
