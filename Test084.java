/*=============================
++++++++++�迭(array)++++++++++
-�迭�� �⺻���� Ȱ��
===============================
�� Test084.java
=============================*/

// �� ����
// ����ڷκ��� ������ ������ ������ ������ŭ �Է¹޾�
// �Է¹��� �� �߿��� ���� ū ���� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ����
// �Է��� �������� ����: 10
// ������ �Է�(���� ����): 47 92 73 11 2 61 23 62 88 15		//--�迭 ����
// >> ���� ū �� �� 92
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


import java.util.Scanner;


public class Test084
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int max = 0;
		
		System.out.print("�Է��� �������� ����: ");
		int n = sc.nextInt();

		int[] num = new int[n];

		System.out.print("������ �Է�(���� ����): ");

		for (int i=0; i<n; i++)
			num[i] = sc.nextInt();

		for (int j=0; j<n; j++)
		{
			if (num[j] > max)
				max = num[j];
		}

		System.out.println(">> ���� ū �� �� "+max);
	}
}


/*
[���� ���]
�Է��� �������� ����: 10
������ �Է�(���� ����): 47 92 73 11 2 61 23 62 88 15
>> ���� ū �� �� 92
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/