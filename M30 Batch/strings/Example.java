package strings;

public class Example 
{
	public static void main(String[] args) 
	{
		System.out.println("started");
		
		new Example().control(0, 9);
		
		System.out.println("\nended");
	}
	
	public void printPat(int i,int cons)
	{
		System.out.print(i+1);
		
		if(i<cons)
		{
			printPat(i+1,cons);
			System.out.print(i+1);
		}
	}
	
	public void printSpace(int i,int cons)
	{
		
		
		if(i<=cons)
		{
			System.out.print("*");
			printSpace(i+1, cons);
		}
	}
	
	public void control(int i,int cons)
	{
		printSpace(0, cons-i-1);
		printPat(0, i);
		System.out.println();
		
		if(i<cons)
		{
			control(i+1, cons);
		}
	}
}
