/*=====================================
++++++++++�ڹ� �⺻ ���α׷���++++++++++
-������ �ڷ���
-�ڹ��� �⺻ �����
=======================================
�� Test014.java
=====================================*/

// ����ڷκ��� �̸��� ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ����
// �̸��� �Է��ϼ���: �弭��
// ���� ���� �Է�: 90
// ���� ���� �Է�: 80
// ���� ���� �Է�: 70
// ====[���]====
// �̸�: �弭��
// ����: 240
// ==============
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		String name;
		int a, b, c, sum;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�̸��� �Է��ϼ���: ");
		name = br.readLine();
		System.out.print("���� ���� �Է�: ");
		a = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է�: ");
		b = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է�: ");
		c = Integer.parseInt(br.readLine());

		sum = a + b + c;

		System.out.printf("\n====[���]====\n�̸�: %s\n����: %d\n==============\n", name, sum);
	}
}

/*
[����� Ǯ��]

//InputStreamReader �ν��Ͻ� ���� + BufferedReader �ν��Ͻ� ����
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

// �ֿ� ���� ����
String strName;				//--�̸� ����(�밡���� ǥ���)
int nKor, nEng, nMat, nTot;	//--����, ����, ���� ����, ���� ����

// �߰� ���� ����
String strTemp;				//--���ڿ� ������ �ӽ� ���� ����

// ���� �� ó��
// ��-�� ����ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
System.out.print("�̸��� �Է��ϼ���: ");

// ��-�� ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
strName = br.readLine();

// ��-�� ����ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
System.out.print("���� ���� �Է�: ");

// ��-�� ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
strTemp = br.readLine();			//--���ڿ� �ӽ� ����
nKor = Integer.parseInt(strTemp);	//--�ӽ� ���� ������ �� ��ȯ �� �������� ������ ��Ƴ���

// ��-�� ����ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
System.out.print("���� ���� �Է�: ")

// ��-�� ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
strTemp = br.readLine();			//--���ڿ� �ӽ� ����(���� �Է��� �����Ͱ� ����� ��)
nEng = Integer.parseInt(strTemp);	//--�ӽ� ���� ������ �� ��ȯ �� �������� ������ ��Ƴ���

// ��-�� ����ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
System.out.print("���� ���� �Է�: ");

// ��-�� ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
strTemp = br.readLine();			//--���ڿ� �ӽ� ����
nMat = Integer.parseInt(strTemp);	//--�ӽ� ���� ������ �� ��ȯ �� �������� ������ ��Ƴ���

// �� �Էµ� �����͵�(nKor, nEng, nMat)�� �����Ͽ� ���� �����ϱ�
nTot = nKor + nEng + nMat;

// ��� ���
System.out.println();
System.out.println("====[���]====");
System.out.println("�̸�: "+strName);
System.out.println("����: "+nTot);
System.out.println("==============");
*/


/*
[���� ���]
�̸��� �Է��ϼ���: �弭��
���� ���� �Է�: 90
���� ���� �Է�: 80
���� ���� �Է�: 70

====[���]====
�̸�: �弭��
����: 240
==============
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/