package edu.introduction;

public class Merger 
{
	public static void main(String[] args) 
	{
		int[] a1={7,14};
		int[] a2={12,10,11};
		int[] a3=new int[a1.length+a2.length];
		int i=a2.length-1,j=0,k=0;
		for(;i>=0&&k<a1.length;i--,k++)
		{
			a3[j++]=a2[i];
			a3[j++]=a1[k];
		}
		for(;k<a1.length;k++)
			a3[j++]=a1[k];
		for(;i>=0;i--)
			a3[j++]=a2[i];
		for(int y =0;y<a3.length;y++)
			System.out.println(a3[y]);
	}
}
