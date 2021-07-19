/*==================================
++++++++++������(Operator)++++++++++
- ���� ������
====================================
�� Test028.java
==================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �������, ��������, 0���� �����Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է� �����ʹ� BufferedReader�� readLine()�� ���� �Ѱܹ޵��� �Ѵ�.
// ����, ���� ������(���� ������)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

// ���� ����
// ������ ���� �Է�: -12
// -12 �� ����
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test028
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ ���� �Է�: ");
		int a = Integer.parseInt(br.readLine());

		String result = a == 0 ? "0" : (a > 0 ? "���" : "����");

		System.out.printf(" %d �� %s\n ", a, result);
	}
}

/*
[����� Ǯ��]
// �ֿ� ���� ����
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n;				//--����� �Է°��� ���� ����
String strResult;	//--�������� ������� 0���� �Ǻ� ����� ���� ����

// ���� �� ó��
// �� ����ڿ��� �ȳ� �޼��� ���
System.out.print("������ ���� �Է�: ");
// �� ����� �Է� �����͸� ���� n�� ��Ƴ���
n = Integer.parseInt(br.readLine());
strResult = n > 0 ? "���" : (n < 0 ? "����" : "0")

// n�� 0���� ũ�� �� true  �� ���
// 			      �� false �� n�� 0���� �۴� �� true  �� ����
//                                           �� false �� 0

// ��� ���
System.out.printf(" %d �� %s\n ", n, strResult);


/*
[���� ���]
������ ���� �Է�: -12
 -12 �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
������ ���� �Է�: 12
 12 �� ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
������ ���� �Է�: 0
 0 �� 0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/