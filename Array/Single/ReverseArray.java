package edu.introduction;

public class ReverseArray 
{
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6};
		int i=0,j=a.length-1;
		while(i<a.length/2)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		for (int j2 = 0; j2 < a.length; j2++) {
			System.out.println(a[j2]);
		}
	}
}
