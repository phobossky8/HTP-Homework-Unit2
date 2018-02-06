package by.lbtsk.hw2.ex03_3;

import java.util.Random;
import java.util.Scanner;

public class IncreasingArr {

	public static void main(String[] args) {
		int num = inputNumber("Введите количество элементов случайной последовательности: ");

		double[] arr = enterRandomArr(num);
		printArr(arr);
		checkArr(arr);

	}

	public static int inputNumber(String message) {
		Scanner sc = new Scanner(System.in);

		System.out.print(message);

		while (!(sc.hasNextInt())) {
			sc.next();
			System.out.print("Введите ЦЕЛОЕ число элементов: ");
		}

		int n = sc.nextInt();
		return n;

	}

	public static double[] enterRandomArr(int num) {
		double[] arr = new double[num];

		for (int i = 0; i < num; i++) {
			arr[i] = Math.random() * 10;
		}
		return arr;
	}

	public static void printArr(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "] ");
		}

		System.out.println("");
	}

	public static void checkArr(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[i + 1]) {
				System.out.println("Последовательность возрастающая");
				break;
			} else {
				System.out.println("Последовательность невозрастающая");
				break;
			}
		}

	}
}
