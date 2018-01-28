package edu.introduction;
import java.util.Scanner;
public class OddEleEvenPositon 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the size of the array:");
		int size = sc.nextInt();
		int a[] = new int[size];
		readValues(a);
		display(a);
		int sum=oddEleEvenPositonSum(a);
		System.out.println("Sum of odd elements in even position:"+sum);
	}
	static int oddEleEvenPositonSum(int a[])
	{
		int oddSum=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(i%2 == 0)
			{
				System.out.print("i="+i);
				if(a[i]%2 != 0)
				{
					System.out.println("->a["+i+"]="+a[i]);
					oddSum = oddSum +a[i];
				}
			}
		}
		return oddSum;
	}
	static void readValues(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter value for a["+i+"]=");
			a[i]=sc.nextInt();
		}
	}
	static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.println("Value at a["+i+"]="+a[i]);
	}
	static int findSum(int a[])
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
			sum=sum+a[i];
		return sum;
	}
}