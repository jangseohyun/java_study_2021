/*==================================
+++++���� �帧�� ��Ʈ��(���)+++++
- if~else�� �ǽ�
====================================
�� Test036.java
==================================*/

// ����ڷκ��� ������ ������ �� �� �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ����
// ù ��° ���� �Է�: 45
// �� ��° ���� �Է�: 81
// �� ��° ���� �Է�: 13
// >> ���� ���: 13 45 81
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test036 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù ��° ���� �Է�: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է�: ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է�: ");
		int c = Integer.parseInt(br.readLine());

		if (a < b && a < c)
		{
			if (b < c)
				System.out.printf(">> ���� ���: %d %d %d\n", a, b, c);
			else if (c < b)
				System.out.printf(">> ���� ���: %d %d %d\n", a, c, b);
		}
		else if (b < a && b < c)
		{
			if (a < c)
				System.out.printf(">> ���� ���: %d %d %d\n", b, a, c);
			else if (c < a)
				System.out.printf(">> ���� ���: %d %d %d\n", b, c, a);
		}
		else if (c < a && c < b)
		{
			if (a < b)
				System.out.printf(">> ���� ���: %d %d %d\n", c, a, b);
			else if (b < a)
				System.out.printf(">> ���� ���: %d %d %d\n", c, b, a);
		}
	}
}

/*
[����� Ǯ��]
int a, b, c;	//--����ڰ� �Է��ϴ� ������ ������ ���� ����
int temp;		//--�ӽ� ���� ����(�� ��)

// 2 2 2 | 3 2 1 | 2 1 3 | 3 1 2 | 1 3 2 | 1 2 3
//       | 2 3 1 | 1 2 3 | 1 3 2 | 1 2 3
//       | 2 1 3         | 1 2 3
//       | 1 2 3

if (a > b)		//--�� ù ��° ������ �� ��° �������� ũ�ٸ�
{
	// �� ����(a, b)�� �ڸ��� �ٲ۴�
	temp = a;
	a = b;
	b = temp;
}
if (b > c)		//--�� �� ��° ������ �� ��° �������� ũ�ٸ�
{
	// �� ����(b, c)�� �ڸ��� �ٲ۴�
	temp = b;
	b = c;
	c = temp;
}
if (a > b)		//--�� ù ��° ������ �� ��° �������� ũ�ٸ� (�ٽ� a�� b�� ���ؾ� ��)
{
	// �� ����(a, b)�� �ڸ��� �ٲ۴�
	temp = a;
	a = b;
	b = temp;
}
System.out.printf(">> ���� ���: %d %d %d", a, b, c);
*/


/*
[���� ���]
ù ��° ���� �Է�: 45
�� ��° ���� �Է�: 81
�� ��° ���� �Է�: 13
>> ���� ���: 13 45 81
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/