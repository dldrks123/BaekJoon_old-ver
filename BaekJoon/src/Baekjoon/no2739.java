package Baekjoon;

import java.util.*;

public class no2739 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}
}