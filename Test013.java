/*=====================================
++++++++++�ڹ� �⺻ ���α׷���++++++++++
-������ �ڷ���
-�ڹ��� �⺻ �����: BufferedReader Ŭ����
=======================================
�� Test013.java
=====================================*/

// �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
// �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.

// ���� ����
// �� �ﰢ���� ���� ���ϱ� ��
// -�ﰢ���� �غ� �Է�: 3
// -�ﰢ���� ���� �Է�: 5
// >> �غ��� 3, ���̰� 5�� �ﰢ���� ����: xxxx
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		int a, b, c;

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("�� �ﰢ���� ���� ���ϱ� ��");
		System.out.print("-�ﰢ���� �غ� �Է�: ");
		a = Integer.parseInt(br1.readLine());
		System.out.print("-�ﰢ���� ���� �Է�: ");
		b = Integer.parseInt(br2.readLine());

		c = (a*b) / 2;
		
		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ����: %d\n", a, b, c);
	}
}

/*
[����� Ǯ��]

// �ܺηκ��� �����͸� �Է¹ޱ� ���ؼ�
// BufferedReader �ν��Ͻ� ����
// �� ���� �ص� ��
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// �ֿ� ���� ����
int underlength, height;		// �غ�, ����
double area;					// ���� üũ

// ���� �� ó��
// �� ����ڿ��� �ȳ� �޼��� ���
System.out.println("�� �ﰢ���� ���� ���ϱ� ��");
System.out.print("-�ﰢ���� �غ� �Է�: ");

// �� ����ڰ� �Է��� ������(�غ�)�� ���� ���·� ��ȯ�� ��
//    ���� underlength�� ��Ƴ���
underlength = Integer.parseInt(br.readLine());

// �� �ٽ� ����ڿ��� �ȳ� �޼��� ���
System.out.print("-�ﰢ���� ���� �Է�: ");

// �� ����ڰ� �Է��� ������(����)�� ���� ���·� ��ȯ�� ��
//    ���� height�� ��Ƴ���
height = Integer.parseInt(br.readLine());

// �� �ﰢ���� ���̸� ���ϴ� ���� ó��
area = underlength * height / 2.0;
// �Ǽ� �ڷ����� ��������� ������ ��������
// �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
// ������ 2�� �ƴ� �Ǽ��� 2.0���� ������ ������ �����ϰ� �Ǹ�
// �� ������ �Ǽ� ������� ó���ȴ�.

// ��� ���
System.out.println();
System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ����: %.2f\n", underlength. height, area);

/*
[���� ���]
�� �ﰢ���� ���� ���ϱ� ��
-�ﰢ���� �غ� �Է�: 3
-�ﰢ���� ���� �Է�: 5
>> �غ��� 3, ���̰� 5�� �ﰢ���� ����: 7
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/