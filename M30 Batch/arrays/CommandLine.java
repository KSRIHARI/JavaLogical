package arrays;

public class CommandLine {
	public static void main(String []args) {
		System.out.println("Array size:" + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println("args["+i+"]="+args[i]);
		}
		System.out.println(args);
		int [] a = new int[-1];
		System.out.println(a);
		System.out.println(a[0]);
	}
}
