package by.lbtsk.hw2.ex03_2;

import java.util.Random;
import java.util.Scanner;

public class ZeroElement {

	public static void main(String[] args) {

		int num = inputNumber("Введите количество элементов случайной последовательности: ");

		int[] arr = enterRandomArr(num);
		printArr(arr);
		int newSize = newArrSize(arr);
		int[] mas = printNewArr(newSize, arr);
		printArr(mas);
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

	public static int[] enterRandomArr(int num) {
		Random rand = new Random();

		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = rand.nextInt(10);
		}
		return arr;
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "] ");
		}

		System.out.println("");
	}

	public static int newArrSize(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		System.out.println("Количество нулевых элементов: " + count);
		return count;
	}

	public static int[] printNewArr(int size, int[] arr) {
		int[] mas = new int[size];

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				mas[j] = i;
				j++;

			}
			
		}
		return mas;
	}
}
