package Encapsulation;

import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("Even Num");
		} else {
			System.out.println("Odd Num");
		}
	}
}
