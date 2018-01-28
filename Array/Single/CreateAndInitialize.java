package edu.introduction;
import java.util.Scanner;
public class CreateAndInitialize 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Reference array created:"+array);
		System.out.println("Size of the array:"+array.length);
		System.out.println("array[4]="+array[4]);
		System.out.println("****************");
		
		int arr2[] = {1,2,3,77,102,111};
		System.out.println("Reference arr2 created:"+arr2);
		System.out.println("Size of the arr2:"+arr2.length);
		System.out.println(arr2[10]);
		System.out.println("finished");
	}
}
