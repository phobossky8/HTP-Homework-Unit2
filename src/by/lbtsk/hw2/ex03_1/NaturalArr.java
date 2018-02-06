package by.lbtsk.hw2.ex03_1;

import java.util.Random;
import java.util.Scanner;

public class NaturalArr {

	public static void main(String[] args) {
		int n;
		int K;
		n = enterIndex();

		int[] arr = new int[n];

		enterRandom(arr);
		printArr(arr);
		K = enterYourNubmer();
		findSum(arr, K);
	}

	public static int enterIndex() {
		Scanner sc = new Scanner(System.in);
		int k = 0;

		System.out.print("������� ���������� ��������� �������: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("������� ����� ���������� ��������� �������: ");
		}

		k = sc.nextInt();
		return k;
	}

	public static void enterRandom(int[] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}

	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr [" + i + "] = " + arr[i]);
		}
	}

	public static int enterYourNubmer() {
		int g;
		Scanner sc = new Scanner(System.in);

		System.out.print("������� ����� ��� �������� ��� ��������� � ���������� �������: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("���������� ������ ����� �����: ");
		}

		g = sc.nextInt();

		return g;

	}

	public static void findSum(int[] arr, int K) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % K == 0) {
				sum = sum + arr[i];
			}

		} if (sum == 0) {
			System.out.println("� ������ ������� ��� �����, ������� ����� " + K);
		}else {
			System.out.println("C���� ��������� �������, ������� ����� " + K + " ����� " + sum);
		}
		
	}
}
