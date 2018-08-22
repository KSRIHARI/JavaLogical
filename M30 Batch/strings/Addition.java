package strings;

public class Addition {
	void add(int a,int b) {
		System.out.println(a+b); 
	}
	void add(int b) {
		System.out.println(b); 
	}
	void add(int a, String b) {
		System.out.println(a+b); 
	}
	void add(String i, int j) {
		System.out.println(i+j); 
	}
	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.add(10);
		obj.add(10, 20);
		obj.add(5,"Dinga");
		obj.add("john", 90);
	}
}
