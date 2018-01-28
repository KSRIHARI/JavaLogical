package edu.numbers;

public class SpecialNumber 
{
	public static void main(String[] args) {
		int num=39;
		//if(isSPecial(num)==true)
		if(isSPecial(num))	
			System.out.println("Given number is 2digit special");
		else
			System.out.println("Given number is not 2digit special");
	}
	static boolean isSPecial(int n)
	{
		int sum=0,product=1,temp=n;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;//sum=sum+n%10;
			product=product*rem;//product=product*n%10;
			n=n/10;
		}
		System.out.println("Sum:"+sum);
		System.out.println("Product:"+product);
		return temp==sum+product;
		//		if(temp==sum+product)
//			return true;
//		else
//			return false;
	}
}
