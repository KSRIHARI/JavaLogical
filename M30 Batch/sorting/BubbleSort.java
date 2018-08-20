package sorting;

public class BubbleSort 
{
	static int[] bubbleSort(int ar[]) 
	{
		System.out.println(ar);
		int t = 0;
		for (int i = 0; i < ar.length-1 ; i++) 
		{
			for (int j = i+1; j < ar.length; j++) 
			{
//				if (ar[i] > ar[j])//ascending 
				if (ar[i] < ar[j])//descending
				{
					t = ar[i];
					ar[i] = ar[j];
					ar[j] = t;
				}
			}
		}
		return ar;
	}
	public static void main(String[] args) {
		int[] a = {110,17,11,8,3};
		System.out.println(a);
		bubbleSort(a);
		System.out.println(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
