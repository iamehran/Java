//Write Java programs for the following:
// Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		int x;
	Scanner t = new Scanner(System.in);
	System.out.print("enter a number:");
	x = t.nextInt();
	if(x%2==0)
	{
		System.out.println(x+"is Even Number");
	}
	else
	{
		System.out.println(x+"is Odd Number");
	}
}
}
//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class Ename {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = input.next();
		System.out.println("Asalamualikum"+name);
	}
	}
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
	
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//Take 2 numbers as input and print the largest number.
//Input currency in rupees and output in USD.
//To calculate Fibonacci Series up to n numbers.
//To find out whether the given String is Palindrome or not.
//To find Armstrong Number between two given number.