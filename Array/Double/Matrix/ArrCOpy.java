package edu.matrix;

public class ArrCOpy 
{
	public static void main(String[] args) {
		int[] a={1,2,3,4,5};
		int[] b={7,8,9};
		System.arraycopy(a, 0, b,0,2);
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
	}
}
