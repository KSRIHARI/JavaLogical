package strings;

public class CharOccu 
{
	public static void main(String[] args) {
		String s = "Banana";
		char[] ch = s.toCharArray();
		countValues(ch);
	}
	static void countValues(char[] a)
	{
		int n=a.length;
		for (int i = 0; i < n; i++) 
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					int k = j;
					while(k<n-1)
					{
						a[k] = a[k+1];
						k++;
					}
					n--;
					j--;
				}
			}
			System.out.println(a[i]+"->"+count);
		}
	}
}
