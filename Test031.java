/*==================================
+++++���� �帧�� ��Ʈ��(���)+++++
- if�� �ǽ�
====================================
�� Test031.java
==================================*/

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �����Ѵ�.
// ��, BufferedReader�� readLine()�� ���� �Է¹��� �� �ֵ��� �ϸ�
// printf()�� ���� ����� �� �ֵ��� �Ѵ�.

// ���� ����
// �̸� �Է�: �弭��
// ���� ����: 90
// ���� ����: 80
// ���� ����: 70
// >> ����� �̸��� �弭���Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240�̰�, ����� 80�Դϴ�.
// >> ����� B�Դϴ�.
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// �� �̶�, ����� ��� ������ �������� ó���Ѵ�.
//    90�� �̻�			   : A
//    80�� �̻� ~ 90�� �̸�: B
//    70�� �̻� ~ 80�� �̸�: C
//    60�� �̻� ~ 70�� �̸�: D
//    60�� �̸�			   : F


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�̸� �Է�: ");
		String name = br.readLine();

		System.out.print("���� ����: ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("���� ����: ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("���� ����: ");
		int mat = Integer.parseInt(br.readLine());

		int tot = kor + eng + mat;
		int avg = tot / 3;
		String grade = "";

		if (avg >= 90)
		{
			grade = "A";
		}
		else if (avg >= 80)
		{
			grade = "B";
		}
		else if (avg >= 70)
		{
			grade = "C";
		}
		else if (avg >= 60)
		{
			grade = "D";
		}
		else
		{
			grade = "F";
		}

		System.out.printf(">> ����� �̸��� %s�Դϴ�.\n", name);
		System.out.printf(">> ���� ������ %d,\n>> ���� ������ %d,\n>> ���� ������ %d,\n", kor, eng, mat);
		System.out.printf(">> ������ %d�̰�, ����� %d�Դϴ�.\n", tot, avg);
		System.out.printf(">> ����� %s �Դϴ�.\n", grade);
	}
}

/*
[����� Ǯ��]
String name			//--�̸�
int kor, eng, mat;	//--����, ����, ����
int tot;			//--����
double avg			//--���
char grade;			//--���

if (avg >= 90)
{
	grade = 'A';
}
else if (avg >= 80)	//--(avg >= 80 && avg <90) ���� �� �ʿ� ����
{
	grade = 'B';
}
else if (avg >= 70)
{
	grade = 'C';
}
else
{
	grade = 'D';
}

System.out.printf(">> ����� �̸��� %s�Դϴ�.\n", name);
System.out.printf(">> ���� ������ %d,\n>> ���� ������ %d,\n>> ���� ������ %d,\n", kor, eng, mat);
System.out.printf(">> ������ %d�̰�, ����� %.2f�Դϴ�.\n", tot, avg);
System.out.printf(">> ����� %c �Դϴ�.\n", grade);

/*
[���� ���]
�̸� �Է�: �弭��
���� ����: 90
���� ����: 80
���� ����: 70
>> ����� �̸��� �弭���Դϴ�.
>> ���� ������ 90,
>> ���� ������ 80,
>> ���� ������ 70,
>> ������ 240�̰�, ����� 80�Դϴ�.
>> ����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/