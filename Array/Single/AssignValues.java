package edu.introduction;
public class AssignValues 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		System.out.println("main:"+a);
		assignValues(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
//		System.out.println(a[5]);
	}
	static void assignValues(int a[])
	{
		System.out.println("assign:"+a);
		a[0]=100;
		a[1]=a[0]++;
		a[2]=a[0]+a[1];
		a[3]=a[1+2];
		a[4]=a[0+1+2];
		//a[5]=200;
	}
}
