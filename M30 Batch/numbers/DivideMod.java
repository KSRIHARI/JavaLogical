package numbers;

public class DivideMod 
{
	public static void main(String[] args) {
		doTask(17, 10);
	}
	static void doTask(int n,int d)
	{
		int count = 0,t=n;
		while(n>=d)
		{
			count++;
			n=n-d;
		}
		System.out.println(t+"/"+d+"="+count);
		System.out.println(t+"%"+d+"="+n);
	}
}
