package numbers;

public class Unary 
{
	public static void main(String[] args) {
		int x=1,y=1;
		System.out.println(x + y--);
		
		y = x++ - --x + y++ * (x + y--);
		System.out.println(x);
		System.out.println(y);
	}
	
}
