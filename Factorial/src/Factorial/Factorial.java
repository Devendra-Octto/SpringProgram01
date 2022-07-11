package Factorial;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number to Find Factorial !!!");
		int num = s.nextInt();
		int i,fact=1;
		for(i=1;i<=num;i++)
		{
			fact=i*fact;
			
		}
		System.out.println("Factorial of "+num+" is : "+fact);
	}
}
