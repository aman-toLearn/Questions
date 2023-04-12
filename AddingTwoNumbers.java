package level0;

import java.util.Scanner;

//1. Adding Two Numbers
//Write a program to add two integer numbers
public class AddingTwoNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first integer number");
		int a = sc.nextInt();

		System.out.println("Enter first integer number");
		int b = sc.nextInt();

		int sum = a + b;

		System.out.println("Addition of the integers is :" + sum);

	}
}
