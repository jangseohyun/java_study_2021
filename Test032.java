/*==================================
+++++���� �帧�� ��Ʈ��(���)+++++
- if�� �ǽ�
====================================
�� Test032.java
==================================*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test032 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int n;

		System.out.print("������ ���� �Է�: ");
		n = Integer.parseInt(br.readLine());
		*/

		/*
		0�� �Է¹��� ��� ���� ¦���� ������ ������ Ʋ����

		if (n % 2 == 0)
		{
			System.out.println(n + "�� ¦��");
		}
		else if (n == 0)
		{
			System.out.println(n + "�� 0");
		}
		else
		{
			System.out.println(n + "�� Ȧ��");
		}
		*/

		/*
		0�� �Է¹��� ��� ���� ¦���� ������ ������ Ʋ����

		if (n % 2 != 0)
		{
			System.out.println(n + "�� Ȧ��");
		}
		else if (n % 2 == 0)
		{
			System.out.println(n + "�� ¦��");
		}
		else
		{
			System.out.println(n + "�� 0");
		}
		*/

		/*
		if (n == 0)
		{
			System.out.println(n + "�� 0");
		}
		else if (n % 2 == 0)
		{
			System.out.println(n + "�� ¦��");
		}
		else if (n % 2 != 0)
		{
			System.out.println(n + "�� Ȧ��");
		}
		else
		{
			System.out.println("������ �Ұ����� ��Ȳ");
		}
		*/

		System.out.print("���̽�ũ���� ���� ����(1. ����, 2. ����): ");

		if (n == 1)
		{
			System.out.println("����");
		}
		else if (n == 2)
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("����, ���� �̿��� ���̽�ũ�� ���� �Ұ�");
			System.out.println("���� �Ұ�");
		}
	}
}
