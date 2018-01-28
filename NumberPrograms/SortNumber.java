package edu.numbers;
public class SortNumber 
{
	public static void main(String[] args) {
		int num = 97462753;
		int sortedNumber=0;
		for (int i = 0; i <10; i++) 
		{
			int temp = num;
			while(temp>0)
			{
				int digit = temp%10;
				if(digit==i)
				{
					sortedNumber = sortedNumber*10;
					sortedNumber=sortedNumber+digit;
				}
				temp=temp/10;
			}
		}
		System.out.println(sortedNumber);
	}
}
