package by.lbtsk.hw2.ex02;

import java.util.Scanner;

public class NewArr {

	public static void main(String[] args) {
		double[] arr = new double[6];

		for (int i = 0; i < arr.length; i++) {
			Scanner sc = new Scanner(System.in);
			while (!sc.hasNextDouble()) {
				sc.next();
			}
			arr[i] = sc.nextDouble();

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		//������� ���������� ����� � �������
		double max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		System.out.println("���������� ����� � ������� - " + max);
		
		//������� ���������� ����� � �������
		double min = arr[0];
		int minIndex = 0;
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}	
		}
		
		System.out.println("���������� ����� � ������� - " + min + " � ��� ������ - [" + minIndex +"]");
		
		System.out.println("----���������� ������� ������� ������----");
		
		//���������� ���������� ������� ������� ������
		for(int i = 0; i < arr.length; i++) {  //������� ���� ���������� ��� �������� �������
			int k = i;
			
			for(int j = i; j < arr.length; j++) { //���������� ������� ���������� �������  � ���������� ��� ������
				if(arr[k] < arr[j]) {
					k = j;
				}
			}
			
			double b;  //����� ���� ����������� ������������ �������� � ��������
			b = arr[k];
			arr[k] = arr[i];
			arr[i] = b;
			
			System.out.println("arr[" + i + "] = " + arr[i]);
			
		}
		
		System.out.println("----C��������� �����������----");
		
	}

}
