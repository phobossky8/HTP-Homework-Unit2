package by.lbtsk.hw2.ex03_4;

import java.util.Random;
import java.util.Scanner;

public class MasOfEvenNumber {

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
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		
		if(count != 0) {
			System.out.println("Количество четных элементов: " + count);
		} else {
			System.out.println("В этой последовательности нет четных чисел");
		}
		
		return count;
	}

	public static int[] printNewArr(int size, int[] arr) {
		int[] mas = new int[size];

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				mas[j] = arr[i];
				j++;

			}
			
		}
		return mas;
	}
}