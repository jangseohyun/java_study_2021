/*==================================
+++++���� �帧�� ��Ʈ��(���)+++++
- if�� �ǽ�
====================================
�� Test030.java
==================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ ¦������ Ȧ������ �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, BufferedReader�� readLine() �޼ҵ带 ���� �Է¹��� �� �ֵ��� �Ѵ�.
// ���� if���� Ȱ���Ͽ�(if else X) ������ �� �ֵ��� �Ѵ�.

// ���� ����
// ������ ���� �Է�: 37
// 37 �� Ȧ���Դϴ�.
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test030
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ ���� �Է�: ");
		int a = Integer.parseInt(br.readLine());

		// ó�������� �� ���� ��� ���̽�{} ���� ����
		if (a % 2 == 0)
			System.out.printf(" %d ��  ¦���Դϴ�.\n", a);

		if (a % 2 != 0)
			System.out.printf(" %d �� Ȧ���Դϴ�.\n", a);
	}
}


/*
[���� ���]
������ ���� �Է�: 37
 37 �� Ȧ���Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/