package by.lbtsk.hw2.ex03_2otherWay;

import java.util.Random;

public class ZeroElement {

	public static void main(String[] args) {
		int arr[] = new int[15];

		enterRandomArr(arr);
		printArr(arr);
		newNullArr(arr);
	}

	public static void enterRandomArr(int[] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10);
		}

	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "] ");
		}

		System.out.println("");
	}

	public static void newNullArr(int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}

		System.out.println("Количество нулевых элементов массива: " + count);

		int[] mas = new int[count];

		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == 0) {
				mas[i] = j;
				System.out.print("[" + mas[i] + "] ");
			}
		}

	}
}
